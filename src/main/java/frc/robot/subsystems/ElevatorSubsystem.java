package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ElevatorSubsystem extends SubsystemBase{
    private CANSparkMax leftF = new CANSparkMax(6, MotorType.kBrushless);
    private CANSparkMax leftB = new CANSparkMax(3, MotorType.kBrushless);
    private PIDController pController = new PIDController(0.015, 0, 0);
    private Encoder enc = new Encoder(0, 1, false, EncodingType.k4X);
    private double speed = 0.01;
    private double setPoint = 0;
    private double sensorPosition = enc.get();

    private double error = setPoint - sensorPosition;

    private double outputSpeed = 0.015 * error;

    public ElevatorSubsystem(){
        
    }

    public double getEncoder(){
        return enc.get();
    }

    public void resetEncoder(){
        enc.reset();
    }

    public void elevatorUp(){
        leftF.set(speed);
        leftB.set(speed);
    }
    
    public void elevatorDown(){
        leftF.set(-speed);
        leftB.set(-speed);
    }

    public void elevatorStop(){
        leftF.stopMotor();
        leftB.stopMotor();
    }

    @Override
    public void periodic(){
        SmartDashboard.putNumber("Encoder: ", enc.get());
    }
}
