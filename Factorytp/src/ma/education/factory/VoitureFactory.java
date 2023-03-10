package ma.education.factory;

import Name.VoitureLeger;

public class VoitureFactory {
    Voiture commanderVoiture(int v) {
        if (v <= 90) {
            return new VoitureLourde();
        } else if (v > 90 && v < 120) {
            return new VoitureLeger();
        } else if (v > 300) {

        }
        return new VoitureExpress();

    }
}
