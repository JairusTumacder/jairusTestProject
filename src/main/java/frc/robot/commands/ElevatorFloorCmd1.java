package frc.robot.commands;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevatorFloorCmd1 extends CommandBase{
    private ElevatorSubsystem e_subsystem;
    private double setpoint;


    public ElevatorFloorCmd1(ElevatorSubsystem e_subs, double setpoint){
        this.e_subsystem = e_subs;
        this.setpoint = setpoint;
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
        e_subsystem.setElevator();
        
        
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
