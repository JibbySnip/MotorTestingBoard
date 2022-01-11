// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorBoardSubsystem extends SubsystemBase {

  public final CANSparkMax spark0 = new CANSparkMax(0, MotorType.kBrushless);
  public final CANSparkMax spark1 = new CANSparkMax(1, MotorType.kBrushless);
  public final PWMTalonSRX talon0 = new PWMTalonSRX(2);

  /** Creates a new ExampleSubsystem. */
  public MotorBoardSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}