// ATENÇÃO: NÃO TESTE O CÓDIGO ABAIXO SEM AS DEVIDAS PRECAUÇÕES

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class Robot extends TimedRobot {
  private final Spark m_leftFrontMotor = new Spark(0);
  private final Spark m_rightBackMotor = new Spark(1);
  private final Spark m_leftFrontMotor = new Spark(0);
  private final Spark m_rightBackMotor = new Spark(1);
  private final DifferentialDrive m_robotDrive = new DifferentialDrive(
      m_leftMotor, m_rightMotor);
  private final Joystick m_stick1 = new Joystick(0);
  private final Joystick m_stick2 = new Joystick(0);

  @Override
  public void teleopPeriodic() {
    m_robotDrive.tankDrive(m_stick1.getY(), m_stick2.getY())
  }
}
