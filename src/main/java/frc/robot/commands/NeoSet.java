// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.MotorSubsystem;

public class NeoSet extends CommandBase {
  /** Creates a new NeoSet. */
  MotorSubsystem motor;
  double neospeed;

  public NeoSet(MotorSubsystem m_motor, double neospeed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.motor = m_motor;
    this.neospeed = neospeed;
    addRequirements(motor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Neo Motor started!");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    motor.setNeo(neospeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    System.out.println("Neo Motor ended!");
    motor.setNeo(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
