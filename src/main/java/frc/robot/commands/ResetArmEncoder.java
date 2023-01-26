package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class ResetArmEncoder extends CommandBase{
    private ArmSubsystem a_subsystem;

    public ResetArmEncoder(ArmSubsystem a_subs){
        this.a_subsystem = a_subs;
        addRequirements(a_subs);
    }
    @Override
    public void initialize(){

    }
    @Override 
    public void execute(){
        a_subsystem.ResetArmEncoder();
    }
    @Override
    public void end(boolean interrupted){

    }
    @Override
    public boolean isFinished(){
        return false;
    }
}
