package frc.robot;

public interface RobotMap {

    public interface CAN{
        public static final int LEFT=0;
        public static final int RIGHT=1;
        public static final int FEEDER=2;
        public static final int GRIPPER=3;
        public static final int SHOOTER_MASTER=4;
        public static final int SHOOTER_SLAVE=5;
    }

    public interface DIO{
        public static final int POS_ENCODER=0;
        public static final int NEG_ENCODER=1;
        public static final int DIGITAL_INPUT=2;
    }
}
