package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevatorDownCmd extends CommandBase{
    /*private ElevatorSubsystem e_subsystem;

    public ElevatorDownCmd(ElevatorSubsystem e_subs){
        this.e_subsystem = e_subs;
        addRequirements(e_subs);
    }
    @Override
    public void initialize(){
        SmartDashboard.putNumber("Elevator Encoder: ", e_subsystem.getEncoder());
    }
    @Override
    public void execute(){
        SmartDashboard.putNumber("Elevator Encoder: ", e_subsystem.getEncoder());
        if(e_subsystem.getEncoder() >= 80){
            e_subsystem.elevatorStop();
        }
        else if(e_subsystem.getEncoder() > 0){
            e_subsystem.elevatorDown();
        }
        else{
            e_subsystem.elevatorStop();
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
