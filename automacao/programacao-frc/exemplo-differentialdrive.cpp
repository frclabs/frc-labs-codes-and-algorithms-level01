#include <frc/Joystick.h>
#include <frc/SpeedControllerGroup.h>
#include <frc/DifferentialDrive.h>
#include <frc/Spark.h>

class Robot : public frc::TimedRobot
{
	double leftSpeed = .1;	// Apenas demonstração
	double rigthSpeed = .1; // Apenas demonstração
	frc::Spark m_leftFrontMotor{0};
	frc::Spark m_rightFrontMotor{1};
	frc::Spark m_leftBackMotor{0};
	frc::Spark m_rightBackMotor{1};
	frc::SpeedControllerGroup
			m_left{m_leftFrontMotor, m_leftBackMotor};
	frc::SpeedControllerGroup
			m_right{m_rightFrontMotor, m_rightBackMotor};
	frc::DifferentialDrive m_robotDrive{m_leftMotor, m_rightMotor};

public:
	void TeleopPeriodic()
	{
		m_robotDrive.tankDrive(leftSpeed, rigthSpeed);
		// Apenas demonstração
	}
};

#ifndef RUNNING_FRC_TESTS
int main()
{
	return frc::StartRobot<Robot>();
}
#endif
