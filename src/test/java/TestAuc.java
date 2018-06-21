import evaluate.AUC;
import org.junit.Test;

/**
 * Created by mengjun on 18/5/31.
 */
public class TestAuc {
	@Test
	public void test() {
		String ps = "0.001000, 0.917644, 0.905499, 0.001000, 0.997438, 0.001259, 0.001000, 0.003479, 0.001056, 0.998832, 0.099974, 0.002114, 0.243281, 0.001002, 0.001000, 0.105390, 0.956169, 0.914299, 0.001000, 0.039417, 0.001000, 0.001000, 0.998990, 0.001053, 0.957904, 0.998928, 0.001018, 0.030903, 0.001000, 0.302110, 0.001000, 0.006470, 0.976554, 0.045049, 0.998999, 0.974833, 0.001000, 0.001000, 0.982758, 0.001173, 0.001000, 0.123504, 0.001000, 0.001000, 0.977764, 0.001000, 0.006931, 0.002173, 0.999000, 0.923030, 0.125691, 0.001025, 0.998996, 0.001000, 0.010462, 0.998284, 0.001000, 0.001000, 0.998047, 0.004289, 0.930527, 0.275985, 0.001012, 0.001000, 0.001000, 0.995153, 0.998996, 0.950729, 0.998810, 0.719633, 0.939611, 0.978617, 0.011427, 0.998997, 0.998828, 0.001057, 0.970802, 0.003787, 0.001000, 0.005139, 0.998776, 0.001000, 0.998994, 0.001005, 0.051679, 0.001189, 0.827637, 0.001000, 0.001000, 0.001012, 0.001000, 0.345982, 0.001000, 0.001000, 0.011559, 0.011744, 0.939641, 0.001000, 0.001000, 0.988502, 0.001201, 0.980069, 0.003401, 0.001000, 0.998995, 0.001001, 0.973859, 0.001003, 0.003359, 0.001234, 0.998773, 0.999000, 0.898496, 0.003628, 0.010751, 0.001000, 0.998184, 0.023766, 0.001000, 0.001000, 0.999000, 0.001000, 0.001043, 0.005490, 0.025984, 0.001097, 0.001000, 0.998634, 0.999000, 0.998773, 0.001000, 0.001001, 0.997478, 0.001000, 0.006760, 0.040114, 0.050477, 0.001000, 0.001000, 0.998999, 0.001000, 0.001002, 0.050865, 0.998969, 0.991963, 0.998965, 0.001241, 0.006565, 0.998999, 0.997669, 0.993198, 0.001039, 0.001726, 0.909825, 0.001141, 0.001000, 0.081554, 0.001029, 0.001001, 0.001142, 0.937131, 0.001150, 0.001001, 0.001000, 0.997950, 0.001000, 0.001001, 0.001000, 0.004145, 0.898177, 0.001015, 0.998791, 0.001126, 0.057149, 0.994934, 0.001029, 0.009273, 0.006630, 0.992511, 0.995599, 0.087163, 0.001000, 0.018659, 0.998899, 0.001000, 0.998998, 0.001011, 0.146184, 0.998998, 0.998998, 0.998998, 0.001171, 0.998789, 0.990884, 0.001000, 0.998748, 0.924054, 0.001596, 0.005342, 0.999000, 0.999000, 0.999000, 0.999000, 0.999000, 0.001000, 0.001554, 0.001103, 0.001000, 0.998999, 0.001092, 0.001000, 0.001024, 0.001001, 0.018349, 0.139310, 0.997718, 0.997718, 0.995964, 0.998999, 0.998999, 0.001000, 0.002036, 0.001001, 0.001007, 0.001000, 0.020261, 0.959207, 0.001000, 0.001052, 0.001000, 0.002360, 0.998831, 0.998949, 0.003609, 0.001045, 0.001041, 0.003156, 0.053593, 0.001000, 0.931082, 0.919639, 0.034019, 0.002342, 0.001011, 0.001242, 0.001863, 0.961433, 0.001002, 0.998474, 0.018213, 0.001016, 0.002741, 0.868967, 0.931246, 0.997107, 0.999000, 0.999000, 0.885795, 0.001000, 0.998987, 0.998987, 0.181816, 0.001000, 0.001000, 0.001000, 0.998804, 0.001000, 0.998927, 0.074676, 0.764332, 0.001000, 0.001064, 0.001179, 0.998998, 0.001353, 0.001000, 0.997541, 0.998957, 0.006641, 0.001000, 0.943171, 0.001000, 0.141498, 0.001156, 0.002374, 0.001580, 0.001000, 0.001053, 0.999000, 0.010380, 0.979024, 0.001000, 0.998986, 0.972820, 0.001018, 0.001000, 0.001007, 0.998995, 0.005586, 0.102776, 0.001185, 0.001033, 0.001366, 0.001003, 0.953613, 0.994547, 0.001002, 0.960013, 0.229681, 0.960161, 0.042205, 0.001000, 0.977771, 0.022788, 0.001000, 0.956824, 0.495178, 0.495178, 0.995011, 0.001000, 0.269599, 0.007465, 0.001036, 0.025726, 0.001000, 0.005605, 0.001210, 0.001000, 0.993769, 0.909116, 0.017968, 0.998999, 0.276039, 0.001000, 0.001000, 0.789505, 0.003181, 0.001000, 0.001000, 0.904232, 0.249951, 0.001000, 0.001010, 0.001000, 0.026043, 0.129711, 0.001009, 0.002323, 0.001000, 0.999000, 0.019621, 0.959053, 0.001307, 0.001000, 0.001119, 0.001006, 0.998980, 0.001000, 0.107398, 0.920171, 0.001000, 0.998805, 0.998805, 0.973181, 0.867054, 0.999000, 0.001000, 0.001000, 0.001284, 0.016027, 0.001014, 0.091468, 0.007760, 0.865520, 0.974326, 0.844450, 0.986321, 0.968533, 0.136682, 0.998838, 0.001539, 0.067519, 0.160881, 0.088557, 0.001003, 0.001000, 0.970878, 0.001007, 0.001000, 0.001001, 0.001000, 0.006490, 0.996930, 0.998265, 0.001187, 0.998868, 0.010072, 0.999000, 0.001000, 0.957172, 0.988719, 0.044747, 0.998874, 0.001003, 0.001000, 0.013267, 0.999000, 0.001000, 0.001000, 0.981331, 0.068920, 0.998999, 0.109225, 0.001000, 0.001101, 0.001265, 0.998405, 0.998999, 0.998999, 0.001000, 0.001069, 0.001000, 0.001435, 0.866811, 0.001024, 0.001489, 0.001000, 0.975989, 0.998998, 0.847407, 0.001000, 0.999000, 0.971479, 0.007072, 0.001000, 0.998471, 0.001000, 0.999000, 0.998977, 0.979031, 0.002042, 0.999000, 0.001027, 0.998941, 0.007946, 0.001000, 0.001000, 0.998994, 0.001000, 0.001613, 0.985113, 0.001000, 0.961489, 0.001000, 0.914699, 0.998995, 0.001001, 0.808217, 0.970738, 0.001000, 0.003792, 0.998985, 0.996871, 0.036140, 0.837700, 0.997036, 0.040871, 0.001000, 0.017129, 0.998772, 0.001000, 0.117789, 0.999000, 0.994075, 0.001613, 0.001000, 0.993327, 0.001000, 0.001000, 0.004281, 0.998618, 0.001006, 0.003126, 0.001000, 0.001000, 0.001044, 0.054183, 0.184013, 0.001000, 0.001000, 0.019818, 0.001000, 0.997197, 0.014886, 0.998694, 0.001000, 0.954676, 0.001123, 0.067709, 0.010048, 0.892702, 0.976640, 0.001007, 0.001000, 0.001000, 0.001005, 0.999000, 0.989066, 0.001105, 0.001065, 0.016311, 0.998997, 0.001000, 0.001002, 0.049794, 0.998761, 0.992442, 0.001014, 0.977430, 0.001453, 0.120534, 0.001525, 0.957802, 0.002691, 0.998998, 0.001000, 0.998999, 0.998594, 0.001004, 0.001001, 0.995358, 0.118628, 0.049502, 0.001021, 0.989418, 0.001000, 0.254021, 0.998996, 0.001000, 0.003117, 0.999000, 0.001000, 0.998938, 0.098091, 0.002201, 0.008367, 0.001139, 0.001000, 0.998986, 0.917704, 0.001000, 0.195912, 0.995825, 0.001076, 0.887078, 0.915952, 0.001023, 0.001000, 0.984736, 0.001000, 0.999000, 0.001083, 0.968135, 0.995653, 0.039865, 0.988569, 0.005856, 0.060643, 0.007946, 0.997980, 0.001004, 0.001015, 0.001247, 0.990585, 0.997858, 0.001001, 0.109126, 0.833673, 0.999000, 0.007105, 0.001000, 0.042312, 0.004932, 0.001001, 0.001000, 0.001228, 0.001000, 0.001000, 0.001000, 0.001000, 0.950087, 0.950087, 0.999000, 0.844550, 0.999000, 0.001000, 0.008494, 0.010615, 0.088546, 0.993108, 0.189432, 0.013547, 0.001622, 0.001000, 0.001158, 0.001000, 0.001000, 0.917420, 0.330828, 0.001224, 0.001001, 0.999000, 0.001000, 0.001362, 0.998988, 0.930445, 0.001000, 0.001548, 0.149558, 0.987868, 0.917288, 0.998516, 0.002540, 0.001000, 0.001000, 0.001032, 0.001000, 0.001000, 0.001000, 0.001008, 0.001003, 0.925974, 0.998995, 0.975064, 0.001002, 0.018388, 0.999000, 0.027881, 0.052302, 0.991908, 0.999000, 0.325590, 0.001003, 0.001000, 0.001768, 0.967300, 0.001000, 0.986143, 0.001001, 0.996069, 0.001070, 0.999000, 0.021509, 0.001087, 0.001188, 0.941142, 0.998999, 0.001000, 0.007170, 0.001000, 0.001000, 0.999000, 0.013367, 0.974035, 0.001000, 0.998979, 0.001574, 0.998811, 0.001006, 0.998734, 0.001000, 0.001000, 0.001000, 0.998757, 0.001007, 0.004287, 0.079716, 0.001460, 0.008816, 0.997526, 0.997033, 0.999000, 0.001099, 0.001000, 0.998992, 0.968004, 0.973277, 0.959896, 0.001000, 0.001000, 0.001000, 0.001002, 0.001003, 0.001003, 0.141399, 0.001000, 0.161276, 0.980671, 0.918306, 0.001012, 0.001000, 0.001007, 0.841507, 0.001003, 0.001000, 0.001000, 0.999000, 0.001003, 0.001001, 0.983061, 0.953486, 0.001000, 0.028449, 0.999000, 0.998941, 0.999000, 0.986371, 0.459367, 0.998985, 0.983785, 0.987878, 0.001225, 0.001005, 0.348362, 0.986483, 0.998829, 0.009695, 0.006736, 0.001000, 0.001143, 0.957937, 0.998993, 0.999000, 0.002881, 0.001420, 0.104789, 0.001158, 0.007066, 0.998999, 0.998999, 0.998999, 0.001000, 0.495488, 0.998934, 0.001000, 0.001137, 0.997287, 0.996714, 0.004814, 0.999000, 0.001000, 0.001006, 0.001000, 0.987814, 0.001126, 0.917420, 0.025602, 0.001279, 0.998771, 0.987238, 0.037170, 0.024515, 0.003240, 0.998702, 0.998999, 0.080641, 0.997478, 0.001000, 0.998798, 0.001000, 0.001000, 0.001028, 0.998197, 0.998999, 0.707520, 0.001152, 0.891116, 0.997663, 0.001000, 0.899684, 0.999000, 0.001000, 0.001030, 0.998770, 0.094829, 0.001000, 0.001000, 0.102468, 0.001011, 0.001083, 0.007846, 0.791787, 0.116891, 0.001036, 0.582861, 0.001295, 0.040656, 0.014485, 0.957519, 0.010597, 0.996640, 0.001001, 0.001262, 0.998996, 0.001000, 0.008355, 0.001006, 0.999000, 0.001013, 0.001001, 0.008170, 0.001064, 0.002334, 0.001000, 0.001000, 0.001000, 0.321156, 0.001005, 0.767580, 0.999000, 0.001024, 0.991805, 0.001001, 0.999000, 0.002979, 0.001418, 0.001000, 0.001000, 0.091271, 0.001000, 0.998993, 0.001000, 0.001000, 0.001000, 0.001095, 0.001000, 0.006869, 0.973934, 0.012935, 0.001000, 0.001000, 0.093564, 0.051464, 0.001000, 0.001011, 0.996916, 0.001000, 0.001000, 0.001029, 0.998998, 0.996825, 0.001006, 0.001000, 0.922759, 0.001000, 0.003667, 0.001000, 0.001000, 0.001021, 0.998997, 0.001000, 0.001490, 0.001001, 0.001142, 0.998999, 0.001000, 0.998966, 0.999000, 0.003994, 0.001010, 0.001000, 0.002965, 0.998887, 0.998887, 0.998887, 0.047891, 0.001000, 0.001098, 0.991747, 0.031297, 0.001000, 0.001519, 0.001000, 0.093013, 0.735436, 0.931967, 0.972446, 0.014492, 0.001000, 0.998977, 0.001676, 0.001828, 0.001804, 0.999000, 0.001000, 0.002148, 0.999000, 0.006382, 0.107012, 0.019406, 0.971564, 0.040675, 0.001001, 0.998959, 0.909953, 0.001314, 0.001009, 0.998997, 0.026875, 0.974542, 0.999000, 0.997475, 0.998994, 0.001000, 0.991131, 0.001000, 0.001213, 0.001007, 0.001000, 0.998999, 0.998999, 0.997190, 0.056498, 0.998996, 0.999000, 0.998980, 0.303086, 0.001080, 0.002030, 0.949692, 0.002038, 0.981411, 0.981411, 0.002551, 0.001066, 0.001006, 0.001039, 0.121150, 0.001000, 0.998998, 0.998998, 0.998998, 0.001078, 0.796011, 0.998793, 0.985972, 0.001198, 0.003168, 0.024178, 0.004442, 0.998971, 0.998971, 0.025927, 0.001000, 0.014410, 0.002536, 0.002683, 0.998887, 0.001279, 0.001000, 0.012780, 0.022537, 0.001000, 0.991998, 0.021896, 0.001010, 0.998999, 0.001002, 0.001003, 0.898510, 0.001000, 0.015826, 0.001043, 0.068677, 0.996113, 0.001000, 0.959215, 0.998981, 0.001036, 0.987335, 0.998964, 0.001002, 0.001000, 0.001000, 0.012374, 0.918250, 0.998650, 0.998929, 0.001000, 0.990477, 0.004019, 0.998991, 0.019006, 0.999000, 0.999000, 0.001000, 0.003356, 0.997887, 0.395782, 0.081521";
		String ys = "0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 1.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 0.000000, 1.000000, 1.000000, 0.000000, 0.000000, 1.000000, 0.000000, 0.000000";
		float[] p = new float[ps.split(", ").length];
		float[] y = new float[ys.split(", ").length];
		for (int i=0; i<ps.split(", ").length; i++) {
			p[i] = Float.parseFloat(ps.split(", ")[i]);
			y[i] = Float.parseFloat(ys.split(", ")[i]);
			if (y[i] == 0f && p[i] > 0.5) {
				System.out.println(y[i] + " " + p[i]);
			}

			if (y[i] == 1f && p[i] < 0.5) {
				System.out.println(y[i] + " " + p[i]);
			}
		}
		AUC a = new AUC(p, y);
		System.out.println(a.calculate());
	}
}
