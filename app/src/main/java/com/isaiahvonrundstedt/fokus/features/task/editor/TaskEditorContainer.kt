package com.isaiahvonrundstedt.fokus.features.task.editor

import android.os.Bundle
import com.isaiahvonrundstedt.fokus.databinding.ActivityContainerTaskBinding
import com.isaiahvonrundstedt.fokus.features.shared.abstracts.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TaskEditorContainer: BaseActivity() {
    private lateinit var binding: ActivityContainerTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContainerTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}