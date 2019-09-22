package com.sorrytale.assistant

import android.app.assist.AssistContent
import android.app.assist.AssistStructure
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.service.voice.VoiceInteractionSession
import java.lang.Exception

class AssistantSession(val c: Context) : VoiceInteractionSession(c) {
    override fun onHandleAssist(
        data: Bundle?,
        structure: AssistStructure?,
        content: AssistContent?
    ) {
        super.onHandleAssist(data, structure, content)
        try {
            Intent(c, MainActivity::class.java).also {
                startAssistantActivity(it)
            }
        } catch (ex: Exception) {
        }
    }
}