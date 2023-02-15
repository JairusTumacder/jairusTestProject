package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
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
    }

    @Override
    public void execute(){
        SmartDashboard.putNumber("Elevator Encoder: ", e_subsystem.getEncoder());
        e_subsystem.setElevator(0);
        
        
    }

    @Override
    public void end(boolean interrupted){
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}
