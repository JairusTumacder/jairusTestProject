package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCmd extends CommandBase{
    /*private final DriveSubsystem d_subsystem;
    private final DoubleSupplier leftSpeed, rightSpeed;

    public DriveCmd(DriveSubsystem subsystem, DoubleSupplier leftSpeed, DoubleSupplier rightSpeed){ 
        this.d_subsystem = subsystem;
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;
        addRequirements(subsystem);
    }
    @Override
    public void initialize(){
    }
    @Override
    public void execute(){
        double left = leftSpeed.getAsDouble();
        double right = rightSpeed.getAsDouble();
        d_subsystem.tankDrive(left, -right);
    }
    @Override
    public void end(boolean interrupted){

    }
    @Override
    public boolean isFinished(){
        return false;
    }*/

}