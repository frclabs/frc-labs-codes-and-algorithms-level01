// ATENÇÃO: NÃO TESTE O CÓDIGO ABAIXO SEM AS DEVIDAS PRECAUÇÕES

/*
Erros encontrados:
(1) Faltou importação da Spark;
(2) As portas das Sparks receberam valores iguais. Cada porta deve 
ser direcionada a um único objeto;
(3) Faltou criar objetos SpeedControllerGroup para agrupar os 
motores de cada lado;
(4) Faltou ponto-e-virgula;
*/

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
// import edu.wpi.first.wpilibj.Spark; (1)
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class Robot extends TimedRobot {
  private final Spark m_leftFrontMotor = new Spark(0);
  private final Spark m_leftBackMotor = new Spark(0);
  private final Spark m_rightBackMotor = new Spark(1);
  private final Spark m_rightFrontMotor = new Spark(1);
  // private final Spark m_leftFrontMotor = new Spark(2); (2)
  // private final Spark m_rightBackMotor = new Spark(3); (2)
  /*
   * private final SpeedControllerGroup m_leftMotor = new
   * SpeedControllerGroup(m_leftBackMotor, m_leftFrontMotor); (3)
   */
  /*
   * private final SpeedControllerGroup m_rightMotor = new
   * SpeedControllerGroup(m_rightBackMotor, m_rightFrontMotor);(3)
   */
  private final DifferentialDrive m_robotDrive = new DifferentialDrive(
      m_leftMotor, m_rightMotor);
  private final Joystick m_stick1 = new Joystick(0);
  private final Joystick m_stick2 = new Joystick(0);

  @Override
  public void teleopPeriodic() {
    m_robotDrive.tankDrive(m_stick1.getY(), m_stick2.getY())
    // m_robotDrive.tankDrive(m_stick1.getY(), m_stick2.getY());(4)
  }
}
