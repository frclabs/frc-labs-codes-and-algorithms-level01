/*
Nota: para que este código compile, é necessário renomear o arquivo para 
Robot.java

Nesta parte incluímos as bibliotecas para o controle dos componentes do robô.
Primeiro incluímos o joystick, com ele poderemos ler os valores de entrada e 
tomar decisões.
Depois incluímos a controladora dos motores, para controlar o PWM do motor.
Em seguida, incluimos a biblioteca que contém componentes importantes para o 
controle do robô.
Por último, incluimos uma biblioteca própria para controle dos motores do chassi.

ATENÇÃO: NESTE EXEMPLO O CONTROLE DO CHASSI SERÁ FEITO APENAS POR
DOIS MOTORES, E O MODO DE CONTROLE SERÁ O ARCADE DRIVE.
*/

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/*
Esta é classe principal do robô. Nela, vamos inserir funções e métodos que irão 
controlar nosso robô.
*/
public class Robot extends TimedRobot {
	// Criamos uma variável do tipo Spark com o nome m_leftMotor (para controlar 
	// o motor esquerdo). O construtor é a porta na RoboRio, no caso, porta 0 
	// (PWM).
	private final Spark m_leftMotor = new Spark(0);
	// Criamos uma variável do tipo Spark com o nome m_rigthMotor (para controlar 
	// o motor direito). O construtor é a porta na RoboRio, no caso, porta 1 
	// (PWM).
	private final Spark m_rightMotor = new Spark(1); 
	/*
	 * Criamos uma variável do tipo DifferentialDrive com o nome m_robotDrive (para
	 * controlar todos os motores de uma vez). O construtor são os motores esquerdo
	 * e direito.
	 */
	private final DifferentialDrive m_robotDrive = new DifferentialDrive(
			m_leftMotor, m_rightMotor);
	
	/*
	* Criamos uma variável m_stick do tipo Joystick para controlar o joystick. A
	* porta dela é 0, o que significa que no DriverStation a joystick deve estar
	* configurado como o primeiro controle disponível.
	*/
	 private final Joystick m_stick = new Joystick(0); 

	/*
	 * Método (função) que repete periodicamente. Irá repetir enquanto o robô
	 * estiver ligado. Coloque nessa função, as instruções que você quer executar no
	 * robô durante a partida, por exemplo, controle do chassi.
	 */
	@Override
	public void teleopPeriodic() {
		/*
		 * Controla o chassi com o método (função) ArcadeDrive passando os parâmetros de
		 * rotação e velocidade. A rotação sera o valor do eixo X no joystick. E a
		 * velocidade será o valor do eixo Y do joystick.
		 */
		m_robotDrive.arcadeDrive(m_stick.getY(), m_stick.getX());
	}
}
