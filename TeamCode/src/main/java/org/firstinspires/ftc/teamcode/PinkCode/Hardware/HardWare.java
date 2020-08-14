package org.firstinspires.ftc.teamcode.PinkCode.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class HardWare {

    public DcMotor dcMotor_tower_left, dcMotor_tower_right;
    public DcMotor.RunMode defaultRunMode = DcMotor.RunMode.RUN_WITHOUT_ENCODER;
    public DcMotor.ZeroPowerBehavior ZeroRunMode = DcMotor.ZeroPowerBehavior.BRAKE;
    private DcMotorSimple.Direction ForwardDir = DcMotorSimple.Direction.FORWARD;
    private DcMotorSimple.Direction BackwardsDir = DcMotorSimple.Direction.REVERSE;
    public HardwareMap hwMap;

    public HardWare(HardwareMap hmap) {
        hwMap = hmap;
    }

    public void Init() {
        dcMotor_tower_left = hwMap.get(DcMotor.class, "motor_tower_left");
        dcMotor_tower_right = hwMap.get(DcMotor.class, "motor_tower_right");

        dcMotor_tower_left.setMode(defaultRunMode);
        dcMotor_tower_right.setMode(defaultRunMode);

        dcMotor_tower_left.setZeroPowerBehavior(ZeroRunMode);
        dcMotor_tower_right.setZeroPowerBehavior(ZeroRunMode);

        dcMotor_tower_left.setDirection(BackwardsDir);
//        dcMotor_tower_right.setDirection(BackwardsDir);
    }
}
