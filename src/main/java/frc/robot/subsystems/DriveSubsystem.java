package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class DriveSubsystem extends SubsystemBase{
    /*private final CANSparkMax leftF = new CANSparkMax(6, MotorType.kBrushless);
    private final CANSparkMax leftB = new CANSparkMax(3, MotorType.kBrushless);
    private final CANSparkMax rightF = new CANSparkMax(2, MotorType.kBrushless);
    private final CANSparkMax rightB = new CANSparkMax(15, MotorType.kBrushless);
    private final MotorControllerGroup leftSide = new MotorControllerGroup(leftF, leftB);
    private final MotorControllerGroup rightSide = new MotorControllerGroup(rightF, rightB);
    private final DifferentialDrive dDrive = new DifferentialDrive(leftSide, rightSide);

    public DriveSubsystem(){
    }

    public void tankDrive(double leftSpeed, double rightSpeed){
        dDrive.tankDrive(deadZone(leftSpeed), deadZone(rightSpeed));
    }
    
    public void arcadeDrive(double xSpeed, double zRotation){
        dDrive.arcadeDrive(deadZone(-xSpeed), zRotation);
    }
    public void stopDrive(){
        leftSide.stopMotor();
        rightSide.stopMotor();
    }

    public double deadZone(double speed){
        if(Math.abs(speed) < 0.01){
            return 0;
        }
        else{
            return speed;
        }
    }
    @Override
    public void periodic(){

    }*/
}
