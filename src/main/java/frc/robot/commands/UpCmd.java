package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class UpCmd extends CommandBase{
    /*private ArmSubsystem ar_subsystem;

    public UpCmd(ArmSubsystem ar_subs){
        this.ar_subsystem = ar_subs;
        addRequirements(ar_subs);
    }
    @Override
    public void initialize(){
        SmartDashboard.putNumber("Arm Encoder: ", ar_subsystem.getArmEncoder());
    }

    @Override
    public void execute(){
        SmartDashboard.putNumber("Arm Encoder: ", ar_subsystem.getArmEncoder());
        if(ar_subsystem.getArmEncoder() >= 80){
            ar_subsystem.armStop();
        }
        else if(ar_subsystem.getArmEncoder() <= 80){
            ar_subsystem.armUp();
        }
        else{
            ar_subsystem.armStop();
        }
    }

    @Override
    public void end(boolean interrupted){
    }

    @Override
    public boolean isFinished(){
        return false;
    }*/
}