/*
Nesta parte incluímos as bibliotecas para o controle dos 
componentes do robô.
Primeiro incluímos o joystick, com ele poderemos ler os valores de 
entrada e tomar decisões.
Depois incluímos a controladora dos motores, para controlar o PWM 
do motor.
Em seguida, incluimos a biblioteca que contém componentes 
importantes para o controle do robô.
Por último, incluimos uma biblioteca própria para controle dos
motores do chassi.

ATENÇÃO: NESTE EXEMPLO O CONTROLE DO CHASSI SERÁ FEITO APENAS POR 
DOIS MOTORES, E O MODO DE CONTROLE SERÁ O ARCADE DRIVE.
*/
#include <frc/Joystick.h>
#include <frc/Spark.h>
#include <frc/TimedRobot.h>
#include <frc/drive/DifferentialDrive.h>

/*
Esta é classe principal do robô. Nela, vamos inserir funções e 
métodos que irão controlar nosso robô.
*/
class Robot : public frc::TimedRobot
{															/* Esta classe herda 
comportamentos de TimedRobot (que incluímos lá em cima)*/
	frc::Spark m_leftMotor{0};	/*Criamos uma variável do tipo Spark 
com o nome m_leftMotor (para controlar o motor esquerdo). O 
construtor é a porta na RoboRio, no caso, porta 0 (PWM).*/
	frc::Spark m_rightMotor{1}; /*Criamos uma variável do tipo 
Spark com o nome m_rigthMotor (para controlar o motor direito). O 
construtor é a porta na RoboRio, no caso, porta 1 (PWM).*/
	frc::DifferentialDrive m_robotDrive{m_leftMotor, m_rightMotor};
	/* Criamos uma variável do tipo DifferentialDrive com o nome 
m_robotDrive (para controlar todos os motores de uma vez). 
O construtor são os motores esquerdo e direito.*/
	frc::Joystick m_stick{0}; /* Criamos uma variável m_stick do 
tipo Joystick para controlar o joystick. A porta dela é 0, o que 
significa que no DriverStation a joystick deve estar configurado 
como o primeiro controle disponível.*/

public: // Métodos públicos
				/*
 Método (função) que repete periodicamente. Irá repetir enquanto o 
robô estiver ligado. Coloque nessa função, as instruções que você 
quer executar no robô durante a partida, por exemplo, controle 
do chassi.
 */
	void TeleopPeriodic()
	{
		/*
    Controla o chassi com o método (função) ArcadeDrive passando 
os parâmetros de rotação e velocidade. A rotação sera o valor do 
eixo X no joystick. E a velocidade será o valor do eixo Y 
do joystick.
    */
		m_robotDrive.ArcadeDrive(m_stick.GetY(), m_stick.GetX());
	}
};

#ifndef RUNNING_FRC_TESTS
int main()
{
	return frc::StartRobot<Robot>();
}
#endif
