package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevatorFloorCmd2 extends CommandBase{
    private ElevatorSubsystem e_subsystem;

    public ElevatorFloorCmd2(ElevatorSubsystem e_subs){
        this.e_subsystem = e_subs;
        addRequirements(e_subs);
    }
    @Override
    public void initialize(){
    }

    @Override
    public void execute(){
         e_subsystem.setElevator(150);
    }
    @Override
    public void end(boolean interrupted){

    }
    @Override
    public boolean isFinished(){
        return false;
    }
}
