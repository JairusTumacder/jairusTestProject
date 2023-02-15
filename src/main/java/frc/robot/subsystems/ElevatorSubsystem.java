package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.math.controller.PIDController;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ElevatorSubsystem extends SubsystemBase{
    private CANSparkMax leftF = new CANSparkMax(6, MotorType.kBrushless);
    private CANSparkMax leftB = new CANSparkMax(3, MotorType.kBrushless);
    private final PIDController pid = new PIDController(0.0007, 0.001, 0.00001);
    private final RelativeEncoder rEnc;
    private double setpoint;
    private double before;

    public ElevatorSubsystem(){
        rEnc = leftF.getEncoder();
        pid.setTolerance(5);
    }

    public double getEncoder(){
        return rEnc.getPosition();
    }

    public void resetEncoder(){
        rEnc.setPosition(0);
    } 

    public void compareErrors(){
        double after = pid.getPositionError();
        if(before > 0 && after < 0){
            pid.reset();
        }
        else if(before < 0 && after > 0){
            pid.reset();
        }
        before = pid.getPositionError();
    }

    public double calcP(double setpoint){
        double error = pid.calculate(getEncoder(), setpoint);
        if(pid.atSetpoint()){
            return 0;
        }
        if(error > 1){
            return 0.5;
        }
        else if(error < -1){
            return -0.5;
        }
        else{
            return error;
        }
    }

    public void setElevator(double setpoint){
            leftF.set(calcP(setpoint));
            leftB.set(calcP(setpoint));
            SmartDashboard.putNumber("P Value: ", calcP(setpoint));
            SmartDashboard.putNumber("Error Value: ", pid.calculate(getEncoder(), setpoint));
            SmartDashboard.putNumber("Setpoint", setpoint);
    }

    @Override
    public void periodic(){
        SmartDashboard.putNumber("Encoder: ", rEnc.getPosition());
    }
}
