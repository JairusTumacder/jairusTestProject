package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class ArcadeDriveCmd extends CommandBase {
    /*private DriveSubsystem a_subsystem;
    private DoubleSupplier xSpeed;
    private DoubleSupplier zRotation;

    public ArcadeDriveCmd(DriveSubsystem a_subs, DoubleSupplier xSpeed, DoubleSupplier zRotation){
        this.a_subsystem = a_subs;
        this.xSpeed = xSpeed;
        this.zRotation = zRotation;
        addRequirements(a_subs);
    }
    @Override
    public void initialize(){
        
    }
    @Override
    public void execute(){
        double speed = xSpeed.getAsDouble();
        double rotation = zRotation.getAsDouble();
        a_subsystem.arcadeDrive(speed, -rotation);
    }
    @Override
    public void end(boolean interrupted){

    }
    @Override
    public boolean isFinished(){
        return false;
    }*/

}
