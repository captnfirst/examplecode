// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.MotorSubsystem;

public class FalconSet extends CommandBase {
  /** Creates a new FalconSet. */
  MotorSubsystem motor;
  double falconspeed;
  public FalconSet(MotorSubsystem m_motor, double falconspeed) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.motor=m_motor;
    this.falconspeed =falconspeed;
    addRequirements(motor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Falcon Motor started!");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    motor.setFalcon(falconspeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    System.out.println("Falcon Motor ended!");
    motor.setFalcon(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
