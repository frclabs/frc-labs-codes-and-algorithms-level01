#include "Robot.h"  // Inclusão do arquivo de cabeçalho

#include <iostream>

/**
* Esta função é executada quando o robô é iniciado pela primeira 
* vez e deve ser utilizada para códigos de configuração inicial.
*/
void Robot::RobotInit() 
{
}

/**
* Esta função é calculada periodicamente em intervalos específicos, 
* não importando o modo de operação atual (autônomo, periódico 
* ou teste).
* Esse código também é executado quando o robô está desabilitado.
*/
void Robot::RobotPeriodic() 
{
}

/**
* Esta função é executado no momento da inicialização do modo 
* autônomo.
*/
void Robot::AutonomousInit() 
{
}

/**
* Esta função será chamada periodicamente durante o modo autônomo.
*/
void Robot::AutonomousPeriodic() 
{
}

/**
* Esta função é executada no momento da inicialização do modo 
* teleoperado.
*/
void Robot::TeleopInit() 
{
}

/**
* Esta função será chamada periodicamente durante o modo 
* teleoperado.
*/
void Robot::TeleopPeriodic() 
{
}

/**
* Esta função será chamada periodicamente durante o modo teste.
*/
void Robot::TestPeriodic() 
{
}

/**
* Esta função será chamada periodicamente durante o modo teste.
*/
void Robot::TestInit() 
{
}

#ifndef RUNNING_FRC_TESTS
int main() { return frc::StartRobot<Robot>(); }
#endif
