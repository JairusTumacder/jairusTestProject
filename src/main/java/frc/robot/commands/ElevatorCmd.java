package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevatorCmd extends CommandBase{
    /*private int steps;
    private ElevatorSubsystem e_subsystem;
    public ElevatorCmd(ElevatorSubsystem e_subsystem){
        this.e_subsystem = e_subsystem;
        addRequirements(e_subsystem);
    }
    @Override
    public void initialize(){
        SmartDashboard.putNumber("Steps:", steps);
        SmartDashboard.putNumber("Encoder Value:", e_subsystem.getEncoder());
        SmartDashboard.putString("State:", "Elevator Cmd Started");
        e_subsystem.resetEncoder();
        steps = 0;
    }
    @Override 
    public void execute(){
        SmartDashboard.putNumber("Steps:", steps);
        SmartDashboard.putNumber("Encoder Value:", e_subsystem.getEncoder());
        SmartDashboard.putString("State:", "Elevator Cmd is Running");
        switch(steps){
            case 0:
            e_subsystem.resetEncoder();
            steps++;
            break;

            case 1:
            if((e_subsystem.getEncoder() <= 80)){
                e_subsystem.elevatorUp();
            }
            else{
                steps++;
            }
            break;

            case 2: 
            if(e_subsystem.getEncoder() > 0){
                e_subsystem.elevatorDown();
            }
            else{
                steps++;
            }
            break;

            case 3:
            if(e_subsystem.getEncoder() <= 80){
                e_subsystem.elevatorUp();           
             }
             else{
                steps++;
             }
             break;
        }
    }
    @Override
    public void end(boolean interrupted){
        steps = 0;
        e_subsystem.elevatorStop();
    }
    @Override
    public boolean isFinished(){
        return steps == 4;
    }*/
 }
