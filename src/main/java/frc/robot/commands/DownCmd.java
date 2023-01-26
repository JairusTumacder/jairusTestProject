package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class DownCmd extends CommandBase{
    private ArmSubsystem arm_subsystem;
    public DownCmd(ArmSubsystem arm_subs){
        this.arm_subsystem = arm_subs;
        addRequirements(arm_subs);
    }

    @Override
    public void initialize(){
        SmartDashboard.putNumber("ArmEncoder: ", arm_subsystem.getArmEncoder());
    }

    @Override
    public void execute(){
        SmartDashboard.putNumber("Arm Encoder: ", arm_subsystem.getArmEncoder());
        if(arm_subsystem.getArmEncoder() >= 80){
            arm_subsystem.armStop();
        }
        else if(arm_subsystem.getArmEncoder() > 0){
            arm_subsystem.armDown();
        }
        else{
            arm_subsystem.armStop();
        }
    }

    @Override
    public void end(boolean interrupted){
    }

    @Override 
    public boolean isFinished(){
        return false;
    }
}
