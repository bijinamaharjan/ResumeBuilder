package com.example.resumebuilder.helper;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import com.example.resumebuilder.datamodel.Resume;

abstract public class ResumeFragment extends Fragment{
    public static final String ARGUMENT_RESUME = "resume";

    public void setResume(Resume resume) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARGUMENT_RESUME, resume);
        setArguments(bundle);
    }

    public Resume getResume() {
        return getArguments().getParcelable(ARGUMENT_RESUME);
    }
}
