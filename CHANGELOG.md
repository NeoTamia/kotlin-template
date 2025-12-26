# Changelog

## [0.1.0](https://github.com/NeoTamia/kotlin-template/compare/v0.0.1...v0.1.0) (2025-12-26)


### ✨ Features

* Add `.editorconfig` and configure Ktlint output ([f5800f6](https://github.com/NeoTamia/kotlin-template/commit/f5800f60a46355aa2413d62ae4d51b570a4a1f6f))
* Set up multi-module Kotlin project with Gradle ([fac4c3f](https://github.com/NeoTamia/kotlin-template/commit/fac4c3faf8528d942b405cd982cd251110412174))


### 🐛 Bug Fixes

* **ci:** Empty actions ([ca5bedd](https://github.com/NeoTamia/kotlin-template/commit/ca5bedd39522c8bcc5ded21bf11e7a0605ecdc92))


### 📚 Documentation

* Add CONTRIBUTING guidelines ([fb085fd](https://github.com/NeoTamia/kotlin-template/commit/fb085fda453266c741ae53c2dff20cfc24cfa1f9))
* Add Contributor Covenant Code of Conduct ([e008af1](https://github.com/NeoTamia/kotlin-template/commit/e008af173b30ed3c862c29d390bad34676c12df1))
* **contributing:** Expand and clarify contribution guidelines ([878d918](https://github.com/NeoTamia/kotlin-template/commit/878d918dcb5a134715c2bed3ff34f3b27c84cd3b))
* **readme:** Restructure and enhance README content ([f4df7f9](https://github.com/NeoTamia/kotlin-template/commit/f4df7f9201ebb7cfaa3f62776e63f6bf7e6db1d2))


### ♻️ Code Refactoring

* Restructure project to use standalone modules and updated build logic ([27b3ea8](https://github.com/NeoTamia/kotlin-template/commit/27b3ea86fcf32bea159b27fd73ba0110287fdea5))
* Update `.editorconfig` for consistency and maintainability ([4a44a5d](https://github.com/NeoTamia/kotlin-template/commit/4a44a5db71470f6aacc77b69792c8f7a6aac642f))


### 🔧 Build System

* **deps:** Pin dependencies ([#11](https://github.com/NeoTamia/kotlin-template/issues/11)) ([2c1d770](https://github.com/NeoTamia/kotlin-template/commit/2c1d7707f963d6ae05ede7d6a05ae75205f082ac))
* **deps:** Update dependency com.gradleup.shadow:shadow-gradle-plugin to v9.3.0 ([#16](https://github.com/NeoTamia/kotlin-template/issues/16)) ([88e6871](https://github.com/NeoTamia/kotlin-template/commit/88e6871e63636442cd5310f95dbf584987010ef5))
* **deps:** Update dependency org.jetbrains.kotlin.jvm to v2.2.21 ([#13](https://github.com/NeoTamia/kotlin-template/issues/13)) ([8205703](https://github.com/NeoTamia/kotlin-template/commit/82057034e58f30677990d27b5ca35786a33762de))
* **deps:** Update dependency org.jetbrains.kotlin.jvm to v2.3.0 ([#18](https://github.com/NeoTamia/kotlin-template/issues/18)) ([b1b04af](https://github.com/NeoTamia/kotlin-template/commit/b1b04afbda82da52322479ee87b53946370fcfd8))
* **deps:** Update gradle to v9.2.0 ([#14](https://github.com/NeoTamia/kotlin-template/issues/14)) ([c59422f](https://github.com/NeoTamia/kotlin-template/commit/c59422f1d594269ff4a975e461d60b9a0848ace0))
* **deps:** Update gradle to v9.2.1 ([#15](https://github.com/NeoTamia/kotlin-template/issues/15)) ([8ea1a55](https://github.com/NeoTamia/kotlin-template/commit/8ea1a55e40de5307d6ca413dfe7ed0f912c20f6f))
* **github:** Simplify `build.yml` by reusing common JVM build action ([e78c228](https://github.com/NeoTamia/kotlin-template/commit/e78c228633ef028fd12c324ae30d42f8f58ecc54))
* **github:** Update Renovate configuration file ([981a0fa](https://github.com/NeoTamia/kotlin-template/commit/981a0fa129cf8a75d5cdf61bfb0d8f0bad1dfd9f))
* **gradle:** Add Ktlint plugin integration ([d2989c9](https://github.com/NeoTamia/kotlin-template/commit/d2989c9e1eef34d604ac7abea73f3767280b226c))
* **gradle:** Add Shadow plugin integration and configure tasks ([e274444](https://github.com/NeoTamia/kotlin-template/commit/e2744441c345e5f3ab35fc82181f68e766b8b610))
* **gradle:** Add support for copying JARs to local repository ([924477b](https://github.com/NeoTamia/kotlin-template/commit/924477b778e8a8b48811a45c3e734209d25ca4f1))
* **gradle:** Disable `mavenJava` publication from core module ([90794d2](https://github.com/NeoTamia/kotlin-template/commit/90794d2c7df8788d2a4439afd121c261f7d56f8b))
* **gradle:** Example of publication override in core module ([72de386](https://github.com/NeoTamia/kotlin-template/commit/72de386365c76078dcbaca3486c525045ddc037c))
* **gradle:** Remove `mavenJava` publication from core module ([d484466](https://github.com/NeoTamia/kotlin-template/commit/d4844662f5c1ffd905e6da57cd7b6434f3e6adeb))
* **gradle:** Remove unused imports in core module configuration ([231e5a6](https://github.com/NeoTamia/kotlin-template/commit/231e5a6abe7044faa92059238b4455927e72b290))
* **gradle:** Update `buildSrc` project name and refine publication setup ([75ae7ba](https://github.com/NeoTamia/kotlin-template/commit/75ae7baf2415d32f8bbf56eea4ddcebede4c127b))
* **gradle:** Update JAR repository path and workflow artifact configuration ([6c581de](https://github.com/NeoTamia/kotlin-template/commit/6c581debdd751cc2c2074b139d33cb5dda587589))
* **gradle:** Update shadow plugin ([831578c](https://github.com/NeoTamia/kotlin-template/commit/831578c59229c75a421e773fc7dae91207a2c93a))
* **gradle:** Use 'kotlin("stdlib")' instead of jetbrains deps ([96c388d](https://github.com/NeoTamia/kotlin-template/commit/96c388db24c3b4920b6d2ca9ab0c8d370ba39c28))
* **gradle:** Use `findProperty` for Maven credentials lookup ([1d1a311](https://github.com/NeoTamia/kotlin-template/commit/1d1a311dc996d83273e5f79272493cade51b1b48))
* **maven:** Configure publishing to Maven repository ([5b7143e](https://github.com/NeoTamia/kotlin-template/commit/5b7143e42ad8305a1ac92e9bc8b23b6bdd8b090b))
* **maven:** Fallback to environment variables for Maven credentials ([7fe9c62](https://github.com/NeoTamia/kotlin-template/commit/7fe9c62ddd1f216834202e321f5b3e01d6b54ce9))


### 👷 Continuous Integration

* **build:** Add basic build workflow ([31c4e27](https://github.com/NeoTamia/kotlin-template/commit/31c4e2787e69cfae0b5f9852a1ade39f1546e444))
* **build:** Add paths ([831578c](https://github.com/NeoTamia/kotlin-template/commit/831578c59229c75a421e773fc7dae91207a2c93a))
* **build:** Update workflow to use correct path for JVM build action ([acc0c67](https://github.com/NeoTamia/kotlin-template/commit/acc0c67c1b4e0ad315c323fa96924ca8670d01e0))
* **publish:** Ensure Gradle wrapper is executable before publishing ([b32e9ed](https://github.com/NeoTamia/kotlin-template/commit/b32e9ed6918f25d5d089bc0ce2b79b5d4581d5d2))
* **publish:** Reuse common JVM publish action in `publish.yml` ([c848fcd](https://github.com/NeoTamia/kotlin-template/commit/c848fcdc6df158b8ce20337fa9e857747f047ab5))
* **publish:** Trigger publish on workflow dispatch events ([846d891](https://github.com/NeoTamia/kotlin-template/commit/846d891f857fce2896391713ea4f387f7622397d))
* **publish:** Update to use and pass the default branch to the reusable publish action. ([82b8fe2](https://github.com/NeoTamia/kotlin-template/commit/82b8fe2c557cea2aa960a6b36a253b8f81a59508))
* **release:** Add explicit secrets for Release Please workflow ([b11c38d](https://github.com/NeoTamia/kotlin-template/commit/b11c38d5ecce0d724f3c1e34da98ccedce15a4a3))
* **release:** Add Gitflow release step to workflow ([a0bad01](https://github.com/NeoTamia/kotlin-template/commit/a0bad010a60e00c2a2b2effad39c7c7d60b0f695))
* **release:** Fix incorrect input name in release workflow ([10daea2](https://github.com/NeoTamia/kotlin-template/commit/10daea2498c822216a5ca3036137f5e24d15bb01))
* **release:** Simplify secrets configuration in Release Please workflow ([8332363](https://github.com/NeoTamia/kotlin-template/commit/8332363f3a11e2fb589cd564b087fba2638f652e))
* **test:** Add test workflow with concurrency control and Gradle integration ([2f0c5dc](https://github.com/NeoTamia/kotlin-template/commit/2f0c5dc903af4f7e760c384ef58b0702ae83f9aa))
* **test:** Add write permissions for checks in test workflow ([ed79a2a](https://github.com/NeoTamia/kotlin-template/commit/ed79a2ab64eb47a526b313e67ad7c0bc42db2f0b))
* **test:** Reuse common JVM actions for test ([82b8fe2](https://github.com/NeoTamia/kotlin-template/commit/82b8fe2c557cea2aa960a6b36a253b8f81a59508))
* **workflow:** Add publish action and enhance concurrency ([3596c11](https://github.com/NeoTamia/kotlin-template/commit/3596c11ad98c9afaaab2c865f64dc9c29a0b33de))
* **workflow:** Refined path triggers in `build` and `publish` workflows. ([2f0c5dc](https://github.com/NeoTamia/kotlin-template/commit/2f0c5dc903af4f7e760c384ef58b0702ae83f9aa))
