public class 3314 {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int energyNeeded = 0;
        int experienceNeeded = 0;

        int currentEnergy = initialEnergy;
        int currentExperience = initialExperience;

        for (int i = 0; i < energy.length; i++) {
            if (currentEnergy <= energy[i]) {
                energyNeeded += (energy[i] - currentEnergy + 1);
                currentEnergy = energy[i] + 1;
            }
            currentEnergy -= energy[i];

            if (currentExperience <= experience[i]) {
                experienceNeeded += (experience[i] - currentExperience + 1);
                currentExperience = experience[i] + 1;
            }
            currentExperience += experience[i];
        }

        return energyNeeded + experienceNeeded;
    }
}
