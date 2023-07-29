/*
 * Copyright 2023 Stanislav Aleshin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * imitations under the License.
 */
package ru.aleshin.features.editor.impl.presentation.theme.tokens

import androidx.compose.runtime.staticCompositionLocalOf
import ru.aleshin.core.ui.theme.tokens.TimePlannerLanguage

/**
 * @author Stanislav Aleshin on 18.02.2023.
 */
internal data class EditorStrings(
    val topAppBarEditorTitle: String,
    val topAppBarBackIconDesc: String,
    val topAppBarMoreIconDesc: String,
    val topAppBarTemplatesTitle: String,
    val mainCategoryChooserTitle: String,
    val subCategoryChooserTitle: String,
    val mainCategoryChooserExpandedIconDesc: String,
    val categoryNotSelectedTitle: String,
    val subCategoryDialogAddedTitle: String,
    val subCategoryDialogMainCategoryFormat: String,
    val timeFieldStartLabel: String,
    val timeFieldEndLabel: String,
    val parameterChooserSwitchIconDesc: String,
    val timePickerHeader: String,
    val timePickerSeparator: String,
    val notifyParameterTitle: String,
    val notifyParameterDesc: String,
    val statisticsParameterTitle: String,
    val statisticsParameterDesc: String,
    val saveTaskButtonTitle: String,
    val cancelButtonTitle: String,
    val templateIconDesc: String,
    val topAppBarDeleteTitle: String,
    val categoryValidateError: String,
    val otherError: String,
    val startOverlayError: String,
    val endOverlayError: String,
    val fullOverlayError: String,
    val correctOverlayTitle: String,
    val durationPickerTitle: String,
    val templatesSheetTitle: String,
    val controlTitle: String,
    val applyTitle: String,
    val timeRangeFormat: String,
    val durationFormat: String,
    val notificationEnabledTitle: String,
    val notificationDisabledTitle: String,
    val emptyTemplatesTitle: String,
    val saveTemplateWarningTitle: String,
    val saveTemplateWarningConfirm: String,
    val saveTemplateWarningUnsave: String,
    val categoriesManageWarningTitle: String,
    val confirmNavigateTitle: String,
    val importantParameterTitle: String,
    val importantParameterDesc: String,
)

internal val russianHomeString = EditorStrings(
    topAppBarEditorTitle = "Редактор",
    topAppBarBackIconDesc = "Назад",
    topAppBarMoreIconDesc = "Дополнительно",
    topAppBarTemplatesTitle = "Шаблоны",
    mainCategoryChooserTitle = "Категория",
    subCategoryChooserTitle = "Подкатегория",
    mainCategoryChooserExpandedIconDesc = "Выбрать категорию",
    categoryNotSelectedTitle = "Отсутствует",
    subCategoryDialogAddedTitle = "Добавить",
    subCategoryDialogMainCategoryFormat = "Категория: %s",
    timeFieldStartLabel = "Старт",
    timeFieldEndLabel = "Конец",
    parameterChooserSwitchIconDesc = "Установить параметр",
    timePickerHeader = "Выберите время",
    timePickerSeparator = ":",
    notifyParameterTitle = "Уведомления",
    notifyParameterDesc = "Отправить уведомление при выполнении задачи",
    statisticsParameterTitle = "Статистика",
    statisticsParameterDesc = "Учитывать данные в статистике",
    saveTaskButtonTitle = "Сохранить",
    cancelButtonTitle = "Отменить",
    templateIconDesc = "Добавить в шаблоны",
    topAppBarDeleteTitle = "Удалить",
    categoryValidateError = "* Выберите категорию",
    otherError = "Ошибка! Обратитесь к разработчику.",
    startOverlayError = "Конфликт! Наложение старта задачи.",
    endOverlayError = "Конфликт! Наложение конца задачи.",
    fullOverlayError = "Конфликт! Наложение задач.",
    correctOverlayTitle = "Исправить",
    durationPickerTitle = "Длительность",
    templatesSheetTitle = "Шаблоны",
    controlTitle = "Управлять",
    applyTitle = "Применить",
    timeRangeFormat = "Время: С %S до %s",
    durationFormat = "Длительность: %s",
    notificationEnabledTitle = "Уведомления: включены",
    notificationDisabledTitle = "Уведомления: выключены",
    emptyTemplatesTitle = "Список пуст",
    saveTemplateWarningTitle = "Вы хотите применить изменения к текущему шаблону?",
    saveTemplateWarningConfirm = "Да",
    saveTemplateWarningUnsave = "Нет",
    categoriesManageWarningTitle = "Вы уверены что хотите перейти на экран управления категориями? " +
        "Текущие параметры останутся несохранёнными.",
    confirmNavigateTitle = "Перейти",
    importantParameterTitle = "Особый приоритет",
    importantParameterDesc = "Обязательное выполнение без возможности сдвига",
)

internal val englishHomeString = EditorStrings(
    topAppBarEditorTitle = "Editor",
    topAppBarBackIconDesc = "Back",
    topAppBarMoreIconDesc = "More",
    topAppBarTemplatesTitle = "Templates",
    mainCategoryChooserTitle = "Category",
    mainCategoryChooserExpandedIconDesc = "Select category",
    subCategoryChooserTitle = "Subcategory",
    categoryNotSelectedTitle = "Absent",
    subCategoryDialogAddedTitle = "Add",
    subCategoryDialogMainCategoryFormat = "Category: %s",
    timeFieldStartLabel = "Start",
    timeFieldEndLabel = "End",
    parameterChooserSwitchIconDesc = "Set parameter",
    timePickerHeader = "Enter time",
    timePickerSeparator = ":",
    notifyParameterTitle = "Notifications",
    notifyParameterDesc = "Send a notification when completing this task",
    statisticsParameterTitle = "Statistics",
    statisticsParameterDesc = "Include task in statistics",
    saveTaskButtonTitle = "Save",
    cancelButtonTitle = "Cancel",
    templateIconDesc = "Add to Templates",
    topAppBarDeleteTitle = "Delete",
    categoryValidateError = "* Select a category",
    otherError = "Error! Contact the developer.",
    startOverlayError = "Conflict! Task start overlay.",
    endOverlayError = "Conflict! Task end overlay.",
    fullOverlayError = "Conflict! Overlapping tasks.",
    correctOverlayTitle = "Fix",
    durationPickerTitle = "Duration",
    templatesSheetTitle = "Templates",
    controlTitle = "Manage",
    applyTitle = "Apply",
    timeRangeFormat = "Time: from %S to %s",
    durationFormat = "Duration: %s",
    notificationEnabledTitle = "Notification: enabled",
    notificationDisabledTitle = "Notification: disabled",
    emptyTemplatesTitle = "List is empty",
    saveTemplateWarningTitle = "Do you want to apply the changes to the current template?",
    saveTemplateWarningConfirm = "Yes",
    saveTemplateWarningUnsave = "No",
    categoriesManageWarningTitle = "Are you sure you want to go to the category management screen? " +
        "The current parameters will remain unsaved",
    confirmNavigateTitle = "Go",
    importantParameterTitle = "Special priority",
    importantParameterDesc = "Mandatory execution without the possibility of shifting",
)

internal val germanHomeString = EditorStrings(
    topAppBarEditorTitle = "Redakteur",
    topAppBarBackIconDesc = "Zurück",
    topAppBarMoreIconDesc = "Zusätzlich",
    topAppBarTemplatesTitle = "Muster",
    mainCategoryChooserTitle = "Kategorie",
    subCategoryChooserTitle = "Unterkategorie",
    mainCategoryChooserExpandedIconDesc = "Kategorie auswählen",
    categoryNotSelectedTitle = "Fehlt",
    subCategoryDialogAddedTitle = "Hinzufügen",
    subCategoryDialogMainCategoryFormat = "Kategorie: %s",
    timeFieldStartLabel = "Start",
    timeFieldEndLabel = "Das Ende",
    parameterChooserSwitchIconDesc = "Parameter festlegen",
    timePickerHeader = "Zeit wählen",
    timePickerSeparator = ":",
    notifyParameterTitle = "Benachrichtigungen",
    notifyParameterDesc = "Benachrichtigung senden, wenn eine Aufgabe ausgeführt wird",
    statisticsParameterTitle = "Statistik",
    statisticsParameterDesc = "Daten in Statistiken berücksichtigen",
    saveTaskButtonTitle = "Speichern",
    cancelButtonTitle = "Abschaffen",
    templateIconDesc = "Zu Vorlagen hinzufügen",
    topAppBarDeleteTitle = "Entfernen",
    categoryValidateError = "* Wählen Sie eine Kategorie aus",
    otherError = "Fehler! Wenden Sie sich an den Entwickler.",
    startOverlayError = "Konflikt! Überlagerung des Aufgabenstarts.",
    endOverlayError = "Konflikt! Überlagert das Ende der Aufgabe.",
    fullOverlayError = "Konflikt! Überlagerung von Aufgaben.",
    correctOverlayTitle = "Korrigieren",
    durationPickerTitle = "Dauer",
    templatesSheetTitle = "Muster",
    controlTitle = "Verwalten",
    applyTitle = "Anwenden",
    timeRangeFormat = "Zeit von %s bis %s Uhr",
    durationFormat = "Dauer: %s",
    notificationEnabledTitle = "Benachrichtigungen: eingeschaltet",
    notificationDisabledTitle = "Benachrichtigungen: sind deaktiviert",
    emptyTemplatesTitle = "Die Liste ist leer",
    saveTemplateWarningTitle = "Möchten Sie die Änderungen auf die aktuelle Vorlage anwenden?",
    saveTemplateWarningConfirm = "Ja",
    saveTemplateWarningUnsave = "Nein",
    categoriesManageWarningTitle = "Sind Sie sicher, dass Sie den Kategoriemanagementbildschirm aufrufen möchten?",
    confirmNavigateTitle = "Übergehen",
    importantParameterTitle = "Besondere Priorität",
    importantParameterDesc = "Zwingende Ausführung ohne Verschiebungsmöglichkeit",
)

internal val LocalEditorStrings = staticCompositionLocalOf<EditorStrings> {
    error("Home Strings is not provided")
}

internal fun fetchEditorStrings(language: TimePlannerLanguage) = when (language) {
    TimePlannerLanguage.EN -> englishHomeString
    TimePlannerLanguage.RU -> russianHomeString
    TimePlannerLanguage.DE -> germanHomeString
}
