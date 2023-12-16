// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

public class MotorSubsystem extends SubsystemBase {
  /** Creates a new MotorSubsystem. */
  public WPI_TalonFX falcon500 = new WPI_TalonFX(MotorConstants.falcon500);

  public CANSparkMax neo = new CANSparkMax(MotorConstants.neo, MotorType.kBrushless);

  public PWMSparkMax bag = new PWMSparkMax(MotorConstants.bagmotor);

  public MotorSubsystem() {
    neo.restoreFactoryDefaults();
  }

  public void setFalcon(double speed) {
    falcon500.set(speed);
  }

  public void setNeo(double speed) {
    neo.set(speed);
  }

  public void setBag(double speed) {
    bag.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
