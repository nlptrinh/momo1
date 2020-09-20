package vn.com.momo.robot;

import javax.inject.Inject;
import javax.inject.Named;
import vn.com.momo.robot.arm.Arm;
import vn.com.momo.robot.leg.Leg;

/**
 * A full robot with both arms and legs.
 */
class FullRobot {
  private final Arm leftArm;
  private final Arm rightArm;
  private final Leg leftLeg;
  private final Leg rightLeg;

  @Inject
  FullRobot(
      @Named("left") Arm leftArm,
      @Named("right") Arm rightArm,
      @Named("left") Leg leftLeg,
      @Named("right") Leg rightLeg
  ) {
    this.leftArm = leftArm;
    this.rightArm = rightArm;
    this.leftLeg = leftLeg;
    this.rightLeg = rightLeg;
  }

  /**
   * Make the robot perform some actions.
   */
  public void doIt() {
    leftArm.punch();
    rightArm.punch();
    leftLeg.kick();
    rightLeg.kick();
  }
}
