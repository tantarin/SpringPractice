# SpringPractice

@NoArgsConstructor генерирует конструктор без параметров. Если это невозможно (потому что поля final), то возникает ошибка компиляции.

@AllArgsConstructor генерирует конструктор с одним параметром для каждого поля в классе. Поля, помеченные @NonNull, имеют проверку на null для этих параметров.

@Accessors(chain=true)
Опция chain дает нам сеттеры, которые возвращают this . Еще раз обратите внимание , что по умолчанию он имеет значение true , но мы установим его явно для ясности.
Это означает, что мы можем объединить несколько операций set в одном операторе.

The @NotBlank annotation uses the NotBlankValidator class, which checks that a character sequences trimmed length is not empty.
