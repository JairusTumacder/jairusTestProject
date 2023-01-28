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
    private final PIDController pid = new PIDController(0.1, 0, 0);
    private final RelativeEncoder rEnc;
    private double setpoint;
    private double lastTime = Timer.getFPGATimestamp();
    private double dT = Timer.getFPGATimestamp() - lastTime;

    public ElevatorSubsystem(){
        rEnc = leftF.getEncoder();
    }

    public double getEncoder(){
        return rEnc.getPosition();
    }

    public void resetEncoder(){
        rEnc.setPosition(0);
    }

    public double calcErrorSum(){
        return pid.calculate(getEncoder(), setpoint) * dT;
    }

    public double calcP(){
        return pid.calculate(getEncoder(), setpoint) * pid.getP();
    }

    public double calcD(){
        return pid.getVelocityError() * pid.getD();
    }

    public double calcI(){
        return calcErrorSum() * pid.getI();
    }

    public void setElevator(){
        leftF.set(calcP() + calcI() + calcD());
        leftB.set(calcP() + calcI() + calcD());
    }

    @Override
    public void periodic(){
        SmartDashboard.putNumber("Encoder: ", rEnc.getPosition());
    }
}
