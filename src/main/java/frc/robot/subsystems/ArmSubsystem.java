package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ArmSubsystem extends SubsystemBase{
    private CANSparkMax rightF = new CANSparkMax(2, MotorType.kBrushless);
    private CANSparkMax rightB = new CANSparkMax(15, MotorType.kBrushless);
    private double speed;

    public ArmSubsystem(){

    }

    public double getArmEncoder(){
        return rightF.getEncoder().getPosition();
    }

    public void ResetArmEncoder(){
        rightF.getEncoder().setPosition(0);
    }
    
    public void armUp(){
        rightF.set(0.1);
        rightB.set(0.1);
    }

    public void armDown(){
        rightF.set(-0.1);
        rightB.set(-0.1);
    }
    public void controlArm(double speed){
        rightF.set(deadZone(speed));
        rightB.set(deadZone(speed));
    }

    public void armStop(){
        rightF.stopMotor();
        rightB.stopMotor();
    }

    public double deadZone(double speed){
        if(Math.abs(speed) < 0.1){
            return 0;
        }
        else{
            return speed;
        }
    }

    @Override
    public void periodic(){
    }

}
