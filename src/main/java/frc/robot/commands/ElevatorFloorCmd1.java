package frc.robot.commands;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevatorFloorCmd1 extends CommandBase{
    private ElevatorSubsystem e_subsystem;


    public ElevatorFloorCmd1(ElevatorSubsystem e_subs){
        this.e_subsystem = e_subs;
        addRequirements(e_subs);
    }

    @Override
    public void initialize(){
        SmartDashboard.putNumber("Elevator Encoder: ", e_subsystem.getEncoder());
        e_subsystem.resetEncoder();
    }

    @Override
    public void execute(){
        SmartDashboard.putNumber("Elevator Encoder: ", e_subsystem.getEncoder());
        if(e_subsystem.getEncoder() > 30){
            e_subsystem.elevatorDown();
        }
        else if(e_subsystem.getEncoder() < 20){
            e_subsystem.elevatorUp();
        }
        else{
            e_subsystem.elevatorStop();
        }
        
    }

    @Override
    public void end(boolean interrupted){
        e_subsystem.resetEncoder();
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}
