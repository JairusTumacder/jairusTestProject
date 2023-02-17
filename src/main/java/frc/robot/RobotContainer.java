// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.ElevatorCmd;
import frc.robot.commands.ElevatorDownCmd;
import frc.robot.commands.ElevatorFloorCmd1;
import frc.robot.commands.ElevatorFloorCmd2;
import frc.robot.commands.ElevatorFloorCmd3;
import frc.robot.commands.ElevatorUpCmd;
import frc.robot.commands.ResetArmEncoder;
import frc.robot.commands.ResetEncoderCmd;
import frc.robot.commands.UpCmd;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.commands.ElevatorCmd;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.commands.DriveCmd;
import frc.robot.commands.UpCmd;
import frc.robot.commands.DownCmd;
import frc.robot.commands.ArcadeDriveCmd;
import frc.robot.commands.StopCmd;
import frc.robot.commands.StopElevatorCmd;

public class RobotContainer {
  private final DriveSubsystem d_subsystem = new DriveSubsystem();
  private final ElevatorSubsystem e_subsystem = new ElevatorSubsystem();
  private final ArmSubsystem a_subsystem = new ArmSubsystem();

      Joystick joystick1 = new Joystick(0);
      Joystick joystick2 = new Joystick(1);

    private final XboxController xController = new XboxController(1);

  public RobotContainer() {
    //d_subsystem.setDefaultCommand(new DriveCmd(d_subsystem, () -> joystick1.getRawAxis(1), () -> joystick2.getRawAxis(1)));
      configureBindings();
  } 
  
  private void configureBindings() {
    //new JoystickButton(xController, 4).whileTrue((new UpCmd(a_subsystem)));
    //new JoystickButton(xController, 4).whileFalse((new StopCmd(a_subsystem)));
    //new JoystickButton(xController, 1).whileTrue((new DownCmd(a_subsystem)));
    //new JoystickButton(xController, 1).whileFalse((new StopCmd(a_subsystem)));

    new JoystickButton(xController, 2).onTrue(new ElevatorFloorCmd1(e_subsystem));
    new JoystickButton(xController, 3).onTrue(new ElevatorFloorCmd2(e_subsystem));
    new JoystickButton(xController, 8).onTrue(new ElevatorFloorCmd3(e_subsystem));
    
    //new JoystickButton(xController, 2).whileFalse(new DownCmd(a_subsystem));
    //new JoystickButton(xController, 3).onTrue(new ElevatorCmd(e_subsystem));
    //new JoystickButton(xController, 3).whileTrue((new ElevatorUpCmd(e_subsystem)));
    //new JoystickButton(xController, 3).whileFalse((new StopElevatorCmd(e_subsystem)));
    //new JoystickButton(xController, 8).whileTrue((new ElevatorDownCmd(e_subsystem)));
    //new JoystickButton(xController, 8).whileFalse((new StopElevatorCmd(e_subsystem)));

    new JoystickButton(xController, 6).onTrue(new ResetEncoderCmd(e_subsystem));
    new JoystickButton(xController, 7).onTrue(new ResetArmEncoder(a_subsystem));

    //new JoystickButton(xController, 2).onTrue(new ArcadeDriveCmd(d_subsystem, () -> xController.getLeftX(), () -> xController.getLeftY()));
    //new JoystickButton(xController, 5).onTrue(new DriveCmd(d_subsystem, () -> xController.getLeftY(), () -> xController.getRightY()));
    }

  public Command getAutonomousCommand() {
    return null;
  }
}