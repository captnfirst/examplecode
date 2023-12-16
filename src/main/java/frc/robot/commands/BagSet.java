// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.MotorSubsystem;

public class BagSet extends CommandBase {
  /** Creates a new BagSet. */
  MotorSubsystem motor;
  double bagspeed;
  public BagSet(MotorSubsystem m_motor, double bagspeed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.motor=m_motor;
    this.bagspeed=bagspeed;
    addRequirements(motor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Bag Motor started!");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    motor.setBag(bagspeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    System.out.println("Bag Motor ended!");
    motor.setBag(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
