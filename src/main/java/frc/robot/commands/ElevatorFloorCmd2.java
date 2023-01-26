package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
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
        SmartDashboard.putNumber("Elevator Encoder: ", e_subsystem.getEncoder());
    }
    @Override
    public void execute(){
        SmartDashboard.putNumber("Elevator Encoder: ", e_subsystem.getEncoder());
        if(e_subsystem.getEncoder() > 60){
            e_subsystem.elevatorDown();
        }
        else if(e_subsystem.getEncoder() < 40){
            e_subsystem.elevatorUp();
        }
        else {
            e_subsystem.elevatorStop();
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
