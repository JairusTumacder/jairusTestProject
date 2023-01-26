package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ElevatorSubsystem extends SubsystemBase{
    private CANSparkMax leftF = new CANSparkMax(6, MotorType.kBrushless);
    private CANSparkMax leftB = new CANSparkMax(3, MotorType.kBrushless);
    private final double kp = 0.1;
    private final double ki = 0;
    private final double kd = 0;
    private final PIDController pController = new PIDController(kp, ki, kd);
    private final RelativeEncoder rEnc;
    private double setpoint;

    public ElevatorSubsystem(){
        rEnc = leftF.getEncoder();
    }

    public double getEncoder(){
        return rEnc.getPosition();
    }

    public void resetEncoder(){
        rEnc.setPosition(0);
    }

    public double calcError(){
        return setpoint - getEncoder();
    }

    public double motorOutput(){
        return kp * calcError();
    }

    public void setElevator(){
        leftF.set(motorOutput());
        leftB.set(motorOutput());
    }

    public void elevatorStop(){
        leftF.stopMotor();
        leftB.stopMotor();
    }

    @Override
    public void periodic(){
        SmartDashboard.putNumber("Encoder: ", rEnc.getPosition());
    }
}
