package org.usfirst.frc.team3863.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;

    public static double WHEEL_BASE = 30;   //in
    public static double TRACK_WIDTH = 30;  //in

    public static int topRight_Drive = 0;
    public static int topRight_Steer = 1;
    public static int topLeft_Drive = 2;
    public static int topLeft_Steer = 3;
    public static int botRight_Drive = 4;
    public static int botRight_Steer = 5;
    public static int botLeft_Drive = 6;
    public static int botLeft_Steer = 7;

    public static double steer_P = 0.0;
    public static double steer_I = 0.0;
    public static double steer_D = 0.0;

    public static int topRight_Solenoid = 0;
    public static int topLeft_Solenoid = 1;
    public static int botRight_Solenoid = 2;
    public static int botLeft_Solenoid = 3;
}
