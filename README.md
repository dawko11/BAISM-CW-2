# BAISM-CW-2

Prosta aplikacja Android (Kotlin) do ćwiczenia CI/CD z testami jednostkowymi i skanem `mobsfscan`.

Workflow Bitrise `safe_build` uruchamia się przy pull requeście do `main` i wykonuje:

1. klonowanie repozytorium,
2. testy jednostkowe (`./gradlew :app:testDebugUnitTest`) — niepowodzenie przerywa build,
3. `mobsfscan --exit-warning` — niepowodzenie przerywa build,
4. budowę debug APK,
5. publikację artefaktów na bitrise.io.

Lokalnie:

```bash
./gradlew :app:testDebugUnitTest
```
