package io.github.golok.biodata.profile;

import io.github.golok.biodata.common.BasePresenter;

/**
 * Satria Adi Putra
 * 10116167
 * IF-4
 * Kamis, 15 Agustus 2019
 */
public interface ProfileContract {
    interface View {
        void showPhoto(int photoId);
        void showName(String name);
        void showDescription(String desc);
        void showNim(String nim);
        void showBirthday(String birthday);
        void showClass(String kelas);
    }

    interface Presenter extends BasePresenter {
    }
}
