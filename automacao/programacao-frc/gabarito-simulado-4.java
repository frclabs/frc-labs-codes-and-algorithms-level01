// ATENÇÃO: NÃO TESTE O CÓDIGO ABAIXO SEM AS DEVIDAS PRECAUÇÕES

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class Robot extends TimedRobot {
  private final Spark m_leftFrontMotor = new Spark(0);
  private final Spark m_leftBackMotor = new Spark(1);
  private final Spark m_rightBackMotor = new Spark(2);
  private final Spark m_rightFrontMotor = new Spark(3);
  private final SpeedControllerGroup m_leftMotor = new SpeedControllerGroup(
      m_leftBackMotor, m_leftFrontMotor);
  private final SpeedControllerGroup m_rightMotor = new SpeedControllerGroup(
      m_rightBackMotor, m_rightFrontMotor);
  private final DifferentialDrive m_robotDrive = new DifferentialDrive(
      m_leftMotor, m_rightMotor);
  private final Joystick m_stick = new Joystick(0);

  @Override
  public void teleopPeriodic() {
    double y = m_stick.getY();
    double x = m_stick.getX();
    if (y > 0.5)
      y = 0.5;
    if (x > 0.5)
      x = 0.5;
    m_robotDrive.arcadeDrive(y, x, true);
  }
}
