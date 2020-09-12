package org.firstinspires.ftc.teamcode.PinkCode.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class HardWare {
    // tower
//    public DcMotor dcMotor_tower_left, dcMotor_tower_right;
    public DcMotor dc_base_back_right, dc_base_back_left, dc_base_front_right, dc_base_front_left;

    public DcMotor.RunMode TowerRunMode = DcMotor.RunMode.STOP_AND_RESET_ENCODER;
    public DcMotor.RunMode BaseRunMode = DcMotor.RunMode.RUN_WITHOUT_ENCODER;
    public DcMotor.ZeroPowerBehavior ZeroRunMode = DcMotor.ZeroPowerBehavior.BRAKE;

    private DcMotorSimple.Direction ForwardDir = DcMotorSimple.Direction.FORWARD;
    private DcMotorSimple.Direction BackwardsDir = DcMotorSimple.Direction.REVERSE;
    public HardwareMap hwMap;

    public HardWare(HardwareMap hmap) {
        hwMap = hmap;
    }

    public void Init() {
//        dcMotor_tower_left = hwMap.get(DcMotor.class, "m_tl");
//        dcMotor_tower_right = hwMap.get(DcMotor.class, "m_tr");

        dc_base_front_right = hwMap.get(DcMotor.class, "motor_base_right_front");
        dc_base_front_left = hwMap.get(DcMotor.class, "motor_base_left_front");
        dc_base_back_left = hwMap.get(DcMotor.class, "motor_base_back_left");
        dc_base_back_right = hwMap.get(DcMotor.class, "motor_base_back_right");

//        dcMotor_tower_left.setMode(TowerRunMode);
//        dcMotor_tower_right.setMode(TowerRunMode);
//
//        dcMotor_tower_left.setZeroPowerBehavior(ZeroRunMode);
//        dcMotor_tower_right.setZeroPowerBehavior(ZeroRunMode);
//
//        dcMotor_tower_left.setDirection(BackwardsDir);

        dc_base_back_right.setMode(BaseRunMode);
        dc_base_back_left.setMode(BaseRunMode);
        dc_base_front_left.setMode(BaseRunMode);
        dc_base_front_right.setMode(BaseRunMode);

        dc_base_back_right.setZeroPowerBehavior(ZeroRunMode);
        dc_base_back_left.setZeroPowerBehavior(ZeroRunMode);
        dc_base_front_left.setZeroPowerBehavior(ZeroRunMode);
        dc_base_front_right.setZeroPowerBehavior(ZeroRunMode);

        dc_base_back_left.setDirection(BackwardsDir);
        dc_base_back_right.setDirection(BackwardsDir);
    }
}
