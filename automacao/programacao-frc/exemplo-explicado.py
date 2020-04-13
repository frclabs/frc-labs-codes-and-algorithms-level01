#!/usr/bin/env python3
"""
Nesta parte incluímos as bibliotecas para o controle dos 
componentes do robô.

ATENÇÃO: NESTE EXEMPLO O CONTROLE DO CHASSI SERÁ FEITO APENAS POR 
DOIS MOTORES, E O MODO DE CONTROLE SERÁ O ARCADE DRIVE.
"""

import wpilib


class MyRobot(wpilib.IterativeRobot):
    def robotInit(self):
        """Função de inicialização do robô. É executada antes de 
		iniciar a partida."""

        self.left = wpilib.Spark(0)  """Criamos uma variável do 
		tipo Spark com o nome m_leftMotor (para controlar o motor esquerdo). 
		O construtor é a porta na RoboRio, no caso, porta 0 (PWM)."""
        self.right = wpilib.Spark(1)  """ Criamos uma variável do 
		tipo Spark com o nome m_rigthMotor (para controlar o motor direito).
		O construtor é a porta na RoboRio, no caso, porta 1 (PWM)."""
        self.drive = DifferentialDrive(self.left, self.right) 
		""" Criamos uma variável do tipo DifferentialDrive com o nome 
		m_robotDrive (para controlar todos os motores de uma vez). O 
		construtor são os motores esquerdo e direito."""

        """ Criamos uma variável stick do tipo Joystick para 
		controlar o joystick. A porta dela é 0, o que significa que no 
		DriverStation a joystick deve estar configurado como o primeiro 
		controle disponível."""
        self.stick = wpilib.Joystick(0)

    def teleopPeriodic(self):
        """ Método (função) que repete periodicamente. Irá repetir 
		enquanto o robô estiver ligado. Coloque nessa função, as instruções 
		que você quer executar no robô durante a partida, por exemplo, 
		controle do chassi."""
        
        """ Controla o chassi com o método (função) ArcadeDrive 
		passando os parâmetros de rotação e velocidade. A rotação sera o 
		valor do eixo X no joystick. E a velocidade será o valor do eixo Y 
		do joystick."""
    	self.myRobot.arcadeDrive(self.stick.getY(), self.stick.getX())


if __name__ == "__main__":
    wpilib.run(MyRobot)
