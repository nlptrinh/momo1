package vn.com.momo.robot;

import javax.inject.Inject;
import javax.inject.Named;
import vn.com.momo.robot.arm.Arm;

class SimpleRobot {
  private final Arm leftArm;
  private final Arm rightArm;

  @Inject
  SimpleRobot(@Named("left") Arm leftArm, @Named("right") Arm rightArm) {
    this.leftArm = leftArm;
    this.rightArm = rightArm;
  }

  /**
   * Return the left arm.
   */
  public Arm getLeftArm() {
    return leftArm;
  }

  /**
   * Return the right arm.
   */
  public Arm getRightArm() {
    return rightArm;
  }
}
