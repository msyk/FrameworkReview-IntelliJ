# FrameworkReview-IntelliJ
The homework about reviewing for framework in "Software Pattern" of TopSE. This project is for IntelliJ.

Sorce code fiels are in the "src/topse/pattern" directory.

minimal-json is included. Thanks to developers.
https://github.com/ralfstx/minimal-json

---
IntelliJでレポジトリから直接読み込むには、以下のように操作します。
* File > New > Project From Version Control > Git とメニュー選択します。メニューがない場合には、パネルにProject From Version Controlと表示されているので、ドロップダウンしてGitを選択します。
* URLにこのレポジトリのURL「https://github.com/msyk/FrameworkReview-IntelliJ/」を指定します。

このレポジトリをIntelliJで開いても、すぐには実行できない模様なので、以下の点をご確認ください。

FileメニューのProject Structureを開き、Project SettingsのProjectの設定項目を確認
* Project SDKを「1.8」など何か選択されている状態にする。
* Project language levelを「8」など、SDKに合わせる。
* Project compiler outputを、FrameworkReview-IntelliJへの絶対パスに「¥out」を付加したものにする。絶対パスは、プロジェクトのファイル一覧が見える最初の行に薄い色で見えているので、それを参考にFrameworkReview-IntelliJフォルダを指定し「¥out」は手で追加する。

FileメニューのProject Structureを開き、Project SettingsのModulesの設定項目を確認
* Sourcesのタブを開くと、プロジェクト内のディレクトリ構造が見える
* srcを選択して、ツリー表示の上のSourceをクリックして、フォルダが青い色になるようにする

Windows以外で利用する場合は、src/topse/pattern/test/ToolTestRun.javaを見て、一部修正をしてください。クラスパスのセパレータが、Windowsの初期値である;担っていますが、それを:に変える必要があります。
