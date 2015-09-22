package utils

/**
 * Created by anatolij on 22/09/15.
 */
class Const {

    public static final Random rnd = new Random()

    /**
     * Total amount of heat to enter the building
     * */
    final Double QPS = rnd.nextDouble() * 89.5

    /**
     * Lowest coefficient of upholding the even distribution of heat
     * */
    final Double KTSSmin = 0.5
    /**
     * Average heat use normalization assigned from law docs
     */
    final Double qPS = 0.016


}
