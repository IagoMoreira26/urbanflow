# .classpath

```
<?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="src" output="target/classes" path="src/main/java">
		<attributes>
			<attribute name="optional" value="true"/>
			<attribute name="maven.pomderived" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry excluding="**" kind="src" output="target/classes" path="src/main/resources">
		<attributes>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="optional" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="src" output="target/test-classes" path="src/test/java">
		<attributes>
			<attribute name="optional" value="true"/>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="test" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry excluding="**" kind="src" output="target/test-classes" path="src/test/resources">
		<attributes>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="test" value="true"/>
			<attribute name="optional" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-21">
		<attributes>
			<attribute name="maven.pomderived" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">
		<attributes>
			<attribute name="maven.pomderived" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="src" path="target/generated-sources/annotations">
		<attributes>
			<attribute name="optional" value="true"/>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="ignore_optional_problems" value="true"/>
			<attribute name="m2e-apt" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="src" output="target/test-classes" path="target/generated-test-sources/test-annotations">
		<attributes>
			<attribute name="optional" value="true"/>
			<attribute name="maven.pomderived" value="true"/>
			<attribute name="ignore_optional_problems" value="true"/>
			<attribute name="m2e-apt" value="true"/>
			<attribute name="test" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="output" path="target/classes"/>
</classpath>

```

# .factorypath

```
<factorypath>
    <factorypathentry kind="VARJAR" id="M2_REPO/org/projectlombok/lombok/1.18.46/lombok-1.18.46.jar" enabled="true" runInBatchMode="false"/>
</factorypath>

```

# .gitattributes

```
/mvnw text eol=lf
*.cmd text eol=crlf

```

# .gitignore

```
HELP.md
target/
.mvn/wrapper/maven-wrapper.jar
!**/src/main/**/target/
!**/src/test/**/target/

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/
build/
!**/src/main/**/build/
!**/src/test/**/build/

### VS Code ###
.vscode/

### Application properties (local configuration) ###
src/main/resources/application.properties
```

# .mvn\wrapper\maven-wrapper.properties

```properties
wrapperVersion=3.3.4
distributionType=only-script
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.14/apache-maven-3.9.14-bin.zip

```

# .project

```
<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
	<name>urbanflow</name>
	<comment></comment>
	<projects>
	</projects>
	<buildSpec>
		<buildCommand>
			<name>org.eclipse.jdt.core.javabuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.springframework.ide.eclipse.boot.validation.springbootbuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.eclipse.m2e.core.maven2Builder</name>
			<arguments>
			</arguments>
		</buildCommand>
	</buildSpec>
	<natures>
		<nature>org.eclipse.jdt.core.javanature</nature>
		<nature>org.eclipse.m2e.core.maven2Nature</nature>
	</natures>
</projectDescription>

```

# .settings\org.eclipse.core.resources.prefs

```prefs
eclipse.preferences.version=1
encoding//src/main/java=UTF-8
encoding//src/main/resources=UTF-8
encoding//src/test/java=UTF-8
encoding/<project>=UTF-8

```

# .settings\org.eclipse.jdt.apt.core.prefs

```prefs
eclipse.preferences.version=1
org.eclipse.jdt.apt.aptEnabled=true
org.eclipse.jdt.apt.genSrcDir=target/generated-sources/annotations
org.eclipse.jdt.apt.genTestSrcDir=target/generated-test-sources/test-annotations

```

# .settings\org.eclipse.jdt.core.prefs

```prefs
eclipse.preferences.version=1
org.eclipse.jdt.core.compiler.codegen.methodParameters=generate
org.eclipse.jdt.core.compiler.codegen.targetPlatform=21
org.eclipse.jdt.core.compiler.compliance=21
org.eclipse.jdt.core.compiler.problem.enablePreviewFeatures=disabled
org.eclipse.jdt.core.compiler.problem.forbiddenReference=warning
org.eclipse.jdt.core.compiler.problem.reportPreviewFeatures=ignore
org.eclipse.jdt.core.compiler.processAnnotations=enabled
org.eclipse.jdt.core.compiler.release=enabled
org.eclipse.jdt.core.compiler.source=21

```

# .settings\org.eclipse.m2e.core.prefs

```prefs
activeProfiles=
eclipse.preferences.version=1
resolveWorkspaceProjects=true
version=1

```

# .settings\org.springframework.ide.eclipse.prefs

```prefs
boot.validation.initialized=true
eclipse.preferences.version=1

```

# HELP.md

```md
# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/4.0.6/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/4.0.6/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/4.0.6/reference/web/servlet.html)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/4.0.6/reference/data/nosql.html#data.nosql.mongodb)
* [Spring Security](https://docs.spring.io/spring-boot/4.0.6/reference/web/spring-security.html)
* [Validation](https://docs.spring.io/spring-boot/4.0.6/reference/io/validation.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/4.0.6/reference/using/devtools.html)
* [SpringDoc OpenAPI](https://springdoc.org/)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [SpringDoc OpenAPI](https://github.com/springdoc/springdoc-openapi-demos/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.


```

# mvnw

```
#!/bin/sh
# ----------------------------------------------------------------------------
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
# ----------------------------------------------------------------------------

# ----------------------------------------------------------------------------
# Apache Maven Wrapper startup batch script, version 3.3.4
#
# Optional ENV vars
# -----------------
#   JAVA_HOME - location of a JDK home dir, required when download maven via java source
#   MVNW_REPOURL - repo url base for downloading maven distribution
#   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
#   MVNW_VERBOSE - true: enable verbose log; debug: trace the mvnw script; others: silence the output
# ----------------------------------------------------------------------------

set -euf
[ "${MVNW_VERBOSE-}" != debug ] || set -x

# OS specific support.
native_path() { printf %s\\n "$1"; }
case "$(uname)" in
CYGWIN* | MINGW*)
  [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME")"
  native_path() { cygpath --path --windows "$1"; }
  ;;
esac

# set JAVACMD and JAVACCMD
set_java_home() {
  # For Cygwin and MinGW, ensure paths are in Unix format before anything is touched
  if [ -n "${JAVA_HOME-}" ]; then
    if [ -x "$JAVA_HOME/jre/sh/java" ]; then
      # IBM's JDK on AIX uses strange locations for the executables
      JAVACMD="$JAVA_HOME/jre/sh/java"
      JAVACCMD="$JAVA_HOME/jre/sh/javac"
    else
      JAVACMD="$JAVA_HOME/bin/java"
      JAVACCMD="$JAVA_HOME/bin/javac"

      if [ ! -x "$JAVACMD" ] || [ ! -x "$JAVACCMD" ]; then
        echo "The JAVA_HOME environment variable is not defined correctly, so mvnw cannot run." >&2
        echo "JAVA_HOME is set to \"$JAVA_HOME\", but \"\$JAVA_HOME/bin/java\" or \"\$JAVA_HOME/bin/javac\" does not exist." >&2
        return 1
      fi
    fi
  else
    JAVACMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v java
    )" || :
    JAVACCMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v javac
    )" || :

    if [ ! -x "${JAVACMD-}" ] || [ ! -x "${JAVACCMD-}" ]; then
      echo "The java/javac command does not exist in PATH nor is JAVA_HOME set, so mvnw cannot run." >&2
      return 1
    fi
  fi
}

# hash string like Java String::hashCode
hash_string() {
  str="${1:-}" h=0
  while [ -n "$str" ]; do
    char="${str%"${str#?}"}"
    h=$(((h * 31 + $(LC_CTYPE=C printf %d "'$char")) % 4294967296))
    str="${str#?}"
  done
  printf %x\\n $h
}

verbose() { :; }
[ "${MVNW_VERBOSE-}" != true ] || verbose() { printf %s\\n "${1-}"; }

die() {
  printf %s\\n "$1" >&2
  exit 1
}

trim() {
  # MWRAPPER-139:
  #   Trims trailing and leading whitespace, carriage returns, tabs, and linefeeds.
  #   Needed for removing poorly interpreted newline sequences when running in more
  #   exotic environments such as mingw bash on Windows.
  printf "%s" "${1}" | tr -d '[:space:]'
}

scriptDir="$(dirname "$0")"
scriptName="$(basename "$0")"

# parse distributionUrl and optional distributionSha256Sum, requires .mvn/wrapper/maven-wrapper.properties
while IFS="=" read -r key value; do
  case "${key-}" in
  distributionUrl) distributionUrl=$(trim "${value-}") ;;
  distributionSha256Sum) distributionSha256Sum=$(trim "${value-}") ;;
  esac
done <"$scriptDir/.mvn/wrapper/maven-wrapper.properties"
[ -n "${distributionUrl-}" ] || die "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"

case "${distributionUrl##*/}" in
maven-mvnd-*bin.*)
  MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/
  case "${PROCESSOR_ARCHITECTURE-}${PROCESSOR_ARCHITEW6432-}:$(uname -a)" in
  *AMD64:CYGWIN* | *AMD64:MINGW*) distributionPlatform=windows-amd64 ;;
  :Darwin*x86_64) distributionPlatform=darwin-amd64 ;;
  :Darwin*arm64) distributionPlatform=darwin-aarch64 ;;
  :Linux*x86_64*) distributionPlatform=linux-amd64 ;;
  *)
    echo "Cannot detect native platform for mvnd on $(uname)-$(uname -m), use pure java version" >&2
    distributionPlatform=linux-amd64
    ;;
  esac
  distributionUrl="${distributionUrl%-bin.*}-$distributionPlatform.zip"
  ;;
maven-mvnd-*) MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/ ;;
*) MVN_CMD="mvn${scriptName#mvnw}" _MVNW_REPO_PATTERN=/org/apache/maven/ ;;
esac

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
[ -z "${MVNW_REPOURL-}" ] || distributionUrl="$MVNW_REPOURL$_MVNW_REPO_PATTERN${distributionUrl#*"$_MVNW_REPO_PATTERN"}"
distributionUrlName="${distributionUrl##*/}"
distributionUrlNameMain="${distributionUrlName%.*}"
distributionUrlNameMain="${distributionUrlNameMain%-bin}"
MAVEN_USER_HOME="${MAVEN_USER_HOME:-${HOME}/.m2}"
MAVEN_HOME="${MAVEN_USER_HOME}/wrapper/dists/${distributionUrlNameMain-}/$(hash_string "$distributionUrl")"

exec_maven() {
  unset MVNW_VERBOSE MVNW_USERNAME MVNW_PASSWORD MVNW_REPOURL || :
  exec "$MAVEN_HOME/bin/$MVN_CMD" "$@" || die "cannot exec $MAVEN_HOME/bin/$MVN_CMD"
}

if [ -d "$MAVEN_HOME" ]; then
  verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  exec_maven "$@"
fi

case "${distributionUrl-}" in
*?-bin.zip | *?maven-mvnd-?*-?*.zip) ;;
*) die "distributionUrl is not valid, must match *-bin.zip or maven-mvnd-*.zip, but found '${distributionUrl-}'" ;;
esac

# prepare tmp dir
if TMP_DOWNLOAD_DIR="$(mktemp -d)" && [ -d "$TMP_DOWNLOAD_DIR" ]; then
  clean() { rm -rf -- "$TMP_DOWNLOAD_DIR"; }
  trap clean HUP INT TERM EXIT
else
  die "cannot create temp dir"
fi

mkdir -p -- "${MAVEN_HOME%/*}"

# Download and Install Apache Maven
verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
verbose "Downloading from: $distributionUrl"
verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

# select .zip or .tar.gz
if ! command -v unzip >/dev/null; then
  distributionUrl="${distributionUrl%.zip}.tar.gz"
  distributionUrlName="${distributionUrl##*/}"
fi

# verbose opt
__MVNW_QUIET_WGET=--quiet __MVNW_QUIET_CURL=--silent __MVNW_QUIET_UNZIP=-q __MVNW_QUIET_TAR=''
[ "${MVNW_VERBOSE-}" != true ] || __MVNW_QUIET_WGET='' __MVNW_QUIET_CURL='' __MVNW_QUIET_UNZIP='' __MVNW_QUIET_TAR=v

# normalize http auth
case "${MVNW_PASSWORD:+has-password}" in
'') MVNW_USERNAME='' MVNW_PASSWORD='' ;;
has-password) [ -n "${MVNW_USERNAME-}" ] || MVNW_USERNAME='' MVNW_PASSWORD='' ;;
esac

if [ -z "${MVNW_USERNAME-}" ] && command -v wget >/dev/null; then
  verbose "Found wget ... using wget"
  wget ${__MVNW_QUIET_WGET:+"$__MVNW_QUIET_WGET"} "$distributionUrl" -O "$TMP_DOWNLOAD_DIR/$distributionUrlName" || die "wget: Failed to fetch $distributionUrl"
elif [ -z "${MVNW_USERNAME-}" ] && command -v curl >/dev/null; then
  verbose "Found curl ... using curl"
  curl ${__MVNW_QUIET_CURL:+"$__MVNW_QUIET_CURL"} -f -L -o "$TMP_DOWNLOAD_DIR/$distributionUrlName" "$distributionUrl" || die "curl: Failed to fetch $distributionUrl"
elif set_java_home; then
  verbose "Falling back to use Java to download"
  javaSource="$TMP_DOWNLOAD_DIR/Downloader.java"
  targetZip="$TMP_DOWNLOAD_DIR/$distributionUrlName"
  cat >"$javaSource" <<-END
	public class Downloader extends java.net.Authenticator
	{
	  protected java.net.PasswordAuthentication getPasswordAuthentication()
	  {
	    return new java.net.PasswordAuthentication( System.getenv( "MVNW_USERNAME" ), System.getenv( "MVNW_PASSWORD" ).toCharArray() );
	  }
	  public static void main( String[] args ) throws Exception
	  {
	    setDefault( new Downloader() );
	    java.nio.file.Files.copy( java.net.URI.create( args[0] ).toURL().openStream(), java.nio.file.Paths.get( args[1] ).toAbsolutePath().normalize() );
	  }
	}
	END
  # For Cygwin/MinGW, switch paths to Windows format before running javac and java
  verbose " - Compiling Downloader.java ..."
  "$(native_path "$JAVACCMD")" "$(native_path "$javaSource")" || die "Failed to compile Downloader.java"
  verbose " - Running Downloader.java ..."
  "$(native_path "$JAVACMD")" -cp "$(native_path "$TMP_DOWNLOAD_DIR")" Downloader "$distributionUrl" "$(native_path "$targetZip")"
fi

# If specified, validate the SHA-256 sum of the Maven distribution zip file
if [ -n "${distributionSha256Sum-}" ]; then
  distributionSha256Result=false
  if [ "$MVN_CMD" = mvnd.sh ]; then
    echo "Checksum validation is not supported for maven-mvnd." >&2
    echo "Please disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  elif command -v sha256sum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | sha256sum -c - >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  elif command -v shasum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | shasum -a 256 -c >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  else
    echo "Checksum validation was requested but neither 'sha256sum' or 'shasum' are available." >&2
    echo "Please install either command, or disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  fi
  if [ $distributionSha256Result = false ]; then
    echo "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised." >&2
    echo "If you updated your Maven version, you need to update the specified distributionSha256Sum property." >&2
    exit 1
  fi
fi

# unzip and move
if command -v unzip >/dev/null; then
  unzip ${__MVNW_QUIET_UNZIP:+"$__MVNW_QUIET_UNZIP"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -d "$TMP_DOWNLOAD_DIR" || die "failed to unzip"
else
  tar xzf${__MVNW_QUIET_TAR:+"$__MVNW_QUIET_TAR"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -C "$TMP_DOWNLOAD_DIR" || die "failed to untar"
fi

# Find the actual extracted directory name (handles snapshots where filename != directory name)
actualDistributionDir=""

# First try the expected directory name (for regular distributions)
if [ -d "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" ]; then
  if [ -f "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain/bin/$MVN_CMD" ]; then
    actualDistributionDir="$distributionUrlNameMain"
  fi
fi

# If not found, search for any directory with the Maven executable (for snapshots)
if [ -z "$actualDistributionDir" ]; then
  # enable globbing to iterate over items
  set +f
  for dir in "$TMP_DOWNLOAD_DIR"/*; do
    if [ -d "$dir" ]; then
      if [ -f "$dir/bin/$MVN_CMD" ]; then
        actualDistributionDir="$(basename "$dir")"
        break
      fi
    fi
  done
  set -f
fi

if [ -z "$actualDistributionDir" ]; then
  verbose "Contents of $TMP_DOWNLOAD_DIR:"
  verbose "$(ls -la "$TMP_DOWNLOAD_DIR")"
  die "Could not find Maven distribution directory in extracted archive"
fi

verbose "Found extracted Maven distribution directory: $actualDistributionDir"
printf %s\\n "$distributionUrl" >"$TMP_DOWNLOAD_DIR/$actualDistributionDir/mvnw.url"
mv -- "$TMP_DOWNLOAD_DIR/$actualDistributionDir" "$MAVEN_HOME" || [ -d "$MAVEN_HOME" ] || die "fail to move MAVEN_HOME"

clean || :
exec_maven "$@"

```

# mvnw.cmd

```cmd
<# : batch portion
@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM Apache Maven Wrapper startup batch script, version 3.3.4
@REM
@REM Optional ENV vars
@REM   MVNW_REPOURL - repo url base for downloading maven distribution
@REM   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
@REM   MVNW_VERBOSE - true: enable verbose log; others: silence the output
@REM ----------------------------------------------------------------------------

@IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)
@SET __MVNW_CMD__=
@SET __MVNW_ERROR__=
@SET __MVNW_PSMODULEP_SAVE=%PSModulePath%
@SET PSModulePath=
@FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0'; $script='%__MVNW_ARG0_NAME__%'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw '%~f0'))) -NoNewScope}"`) DO @(
  IF "%%A"=="MVN_CMD" (set __MVNW_CMD__=%%B) ELSE IF "%%B"=="" (echo %%A) ELSE (echo %%A=%%B)
)
@SET PSModulePath=%__MVNW_PSMODULEP_SAVE%
@SET __MVNW_PSMODULEP_SAVE=
@SET __MVNW_ARG0_NAME__=
@SET MVNW_USERNAME=
@SET MVNW_PASSWORD=
@IF NOT "%__MVNW_CMD__%"=="" ("%__MVNW_CMD__%" %*)
@echo Cannot start maven from wrapper >&2 && exit /b 1
@GOTO :EOF
: end batch / begin powershell #>

$ErrorActionPreference = "Stop"
if ($env:MVNW_VERBOSE -eq "true") {
  $VerbosePreference = "Continue"
}

# calculate distributionUrl, requires .mvn/wrapper/maven-wrapper.properties
$distributionUrl = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionUrl
if (!$distributionUrl) {
  Write-Error "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"
}

switch -wildcard -casesensitive ( $($distributionUrl -replace '^.*/','') ) {
  "maven-mvnd-*" {
    $USE_MVND = $true
    $distributionUrl = $distributionUrl -replace '-bin\.[^.]*$',"-windows-amd64.zip"
    $MVN_CMD = "mvnd.cmd"
    break
  }
  default {
    $USE_MVND = $false
    $MVN_CMD = $script -replace '^mvnw','mvn'
    break
  }
}

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
if ($env:MVNW_REPOURL) {
  $MVNW_REPO_PATTERN = if ($USE_MVND -eq $False) { "/org/apache/maven/" } else { "/maven/mvnd/" }
  $distributionUrl = "$env:MVNW_REPOURL$MVNW_REPO_PATTERN$($distributionUrl -replace "^.*$MVNW_REPO_PATTERN",'')"
}
$distributionUrlName = $distributionUrl -replace '^.*/',''
$distributionUrlNameMain = $distributionUrlName -replace '\.[^.]*$','' -replace '-bin$',''

$MAVEN_M2_PATH = "$HOME/.m2"
if ($env:MAVEN_USER_HOME) {
  $MAVEN_M2_PATH = "$env:MAVEN_USER_HOME"
}

if (-not (Test-Path -Path $MAVEN_M2_PATH)) {
    New-Item -Path $MAVEN_M2_PATH -ItemType Directory | Out-Null
}

$MAVEN_WRAPPER_DISTS = $null
if ((Get-Item $MAVEN_M2_PATH).Target[0] -eq $null) {
  $MAVEN_WRAPPER_DISTS = "$MAVEN_M2_PATH/wrapper/dists"
} else {
  $MAVEN_WRAPPER_DISTS = (Get-Item $MAVEN_M2_PATH).Target[0] + "/wrapper/dists"
}

$MAVEN_HOME_PARENT = "$MAVEN_WRAPPER_DISTS/$distributionUrlNameMain"
$MAVEN_HOME_NAME = ([System.Security.Cryptography.SHA256]::Create().ComputeHash([byte[]][char[]]$distributionUrl) | ForEach-Object {$_.ToString("x2")}) -join ''
$MAVEN_HOME = "$MAVEN_HOME_PARENT/$MAVEN_HOME_NAME"

if (Test-Path -Path "$MAVEN_HOME" -PathType Container) {
  Write-Verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
  exit $?
}

if (! $distributionUrlNameMain -or ($distributionUrlName -eq $distributionUrlNameMain)) {
  Write-Error "distributionUrl is not valid, must end with *-bin.zip, but found $distributionUrl"
}

# prepare tmp dir
$TMP_DOWNLOAD_DIR_HOLDER = New-TemporaryFile
$TMP_DOWNLOAD_DIR = New-Item -Itemtype Directory -Path "$TMP_DOWNLOAD_DIR_HOLDER.dir"
$TMP_DOWNLOAD_DIR_HOLDER.Delete() | Out-Null
trap {
  if ($TMP_DOWNLOAD_DIR.Exists) {
    try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
    catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
  }
}

New-Item -Itemtype Directory -Path "$MAVEN_HOME_PARENT" -Force | Out-Null

# Download and Install Apache Maven
Write-Verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
Write-Verbose "Downloading from: $distributionUrl"
Write-Verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

$webclient = New-Object System.Net.WebClient
if ($env:MVNW_USERNAME -and $env:MVNW_PASSWORD) {
  $webclient.Credentials = New-Object System.Net.NetworkCredential($env:MVNW_USERNAME, $env:MVNW_PASSWORD)
}
[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
$webclient.DownloadFile($distributionUrl, "$TMP_DOWNLOAD_DIR/$distributionUrlName") | Out-Null

# If specified, validate the SHA-256 sum of the Maven distribution zip file
$distributionSha256Sum = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionSha256Sum
if ($distributionSha256Sum) {
  if ($USE_MVND) {
    Write-Error "Checksum validation is not supported for maven-mvnd. `nPlease disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties."
  }
  Import-Module $PSHOME\Modules\Microsoft.PowerShell.Utility -Function Get-FileHash
  if ((Get-FileHash "$TMP_DOWNLOAD_DIR/$distributionUrlName" -Algorithm SHA256).Hash.ToLower() -ne $distributionSha256Sum) {
    Write-Error "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised. If you updated your Maven version, you need to update the specified distributionSha256Sum property."
  }
}

# unzip and move
Expand-Archive "$TMP_DOWNLOAD_DIR/$distributionUrlName" -DestinationPath "$TMP_DOWNLOAD_DIR" | Out-Null

# Find the actual extracted directory name (handles snapshots where filename != directory name)
$actualDistributionDir = ""

# First try the expected directory name (for regular distributions)
$expectedPath = Join-Path "$TMP_DOWNLOAD_DIR" "$distributionUrlNameMain"
$expectedMvnPath = Join-Path "$expectedPath" "bin/$MVN_CMD"
if ((Test-Path -Path $expectedPath -PathType Container) -and (Test-Path -Path $expectedMvnPath -PathType Leaf)) {
  $actualDistributionDir = $distributionUrlNameMain
}

# If not found, search for any directory with the Maven executable (for snapshots)
if (!$actualDistributionDir) {
  Get-ChildItem -Path "$TMP_DOWNLOAD_DIR" -Directory | ForEach-Object {
    $testPath = Join-Path $_.FullName "bin/$MVN_CMD"
    if (Test-Path -Path $testPath -PathType Leaf) {
      $actualDistributionDir = $_.Name
    }
  }
}

if (!$actualDistributionDir) {
  Write-Error "Could not find Maven distribution directory in extracted archive"
}

Write-Verbose "Found extracted Maven distribution directory: $actualDistributionDir"
Rename-Item -Path "$TMP_DOWNLOAD_DIR/$actualDistributionDir" -NewName $MAVEN_HOME_NAME | Out-Null
try {
  Move-Item -Path "$TMP_DOWNLOAD_DIR/$MAVEN_HOME_NAME" -Destination $MAVEN_HOME_PARENT | Out-Null
} catch {
  if (! (Test-Path -Path "$MAVEN_HOME" -PathType Container)) {
    Write-Error "fail to move MAVEN_HOME"
  }
} finally {
  try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
  catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
}

Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"

```

# pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>4.0.6</version>
		<relativePath/>
	</parent>
	<groupId>com.iagomoreira</groupId>
	<artifactId>urbanflow</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name/>
	<description/>
	<url/>
	<licenses>
		<license/>
	</licenses>
	<developers>
		<developer/>
	</developers>
	<scm>
		<connection/>
		<developerConnection/>
		<tag/>
		<url/>
	</scm>
	<properties>
		<java.version>21</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-mongodb</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-webmvc</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>3.0.2</version>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-mongodb-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-webmvc-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
		<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-api</artifactId>
    <version>0.12.6</version>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-impl</artifactId>
    <version>0.12.6</version>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-jackson</artifactId>
    <version>0.12.6</version>
    <scope>runtime</scope>
</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<executions>
					<execution>
						<id>default-compile</id>
						<phase>compile</phase>
						<goals>
							<goal>compile</goal>
						</goals>
						<configuration>
							<annotationProcessorPaths>
								<path>
									<groupId>org.projectlombok</groupId>
									<artifactId>lombok</artifactId>
								</path>
							</annotationProcessorPaths>
						</configuration>
					</execution>
					<execution>
						<id>default-testCompile</id>
						<phase>test-compile</phase>
						<goals>
							<goal>testCompile</goal>
						</goals>
						<configuration>
							<annotationProcessorPaths>
								<path>
									<groupId>org.projectlombok</groupId>
									<artifactId>lombok</artifactId>
								</path>
							</annotationProcessorPaths>
						</configuration>
					</execution>
				</executions>
			</plugin>
			
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.12</version>
				<executions>
					<execution>
						<id>prepare-agent</id>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>report</id>
						<phase>verify</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
</project>
```

# src\main\java\com\iagomoreira\urbanflow\config\SecurityConfig.java

```java
package com.iagomoreira.urbanflow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.iagomoreira.urbanflow.security.JwtAuthenticationFilter;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

	private final JwtAuthenticationFilter jwtAuthenticationFilter;

	public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter) {
		super();
		this.jwtAuthenticationFilter = jwtAuthenticationFilter;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
		return configuration.getAuthenticationManager();
	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(csrf -> csrf.disable())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authorizeHttpRequests(auth -> auth

						.requestMatchers("/auth/login", "/swagger-ui/**", "/swagger-ui.html", "/v3/api-docs/**")
						.permitAll()

						.requestMatchers(HttpMethod.POST, "/users").permitAll()

						.anyRequest().authenticated())

				.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\AuthController.java

```java
package com.iagomoreira.urbanflow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.service.auth.AuthService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "Endpoints for authentication and current user info")
public class AuthController {

	private final AuthService authService;

	public AuthController(AuthService authService) {
		this.authService = authService;
	}

	@GetMapping("/me")
	@Operation(summary = "Get current authenticated user", description = "Returns the details of the logged-in user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content) })
	public ResponseEntity<UserResponseDTO> me() {
		return ResponseEntity.ok(authService.getCurrentUser());
	}

	@PostMapping("/login")
	@Operation(summary = "Authenticate user", description = "Performs login and returns an access token")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Login successful", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LoginResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid credentials", content = @Content) })
	public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginDTO dto) {
		return ResponseEntity.ok(authService.login(dto));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\CategoryController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.service.category.CategoryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/categories")
@Tag(name = "Categories", description = "Endpoints for managing product categories")
public class CategoryController {

	private final CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Create a new category", description = "Creates a category (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Category created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input data", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<CategoryResponseDTO> create(@Valid @RequestBody CreateCategoryDTO dto) {
		CategoryResponseDTO response = categoryService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@PreAuthorize("isAuthenticated()")
	@Operation(summary = "List all categories", description = "Returns a list of all categories")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Categories retrieved successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryResponseDTO.class))),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content) })
	public ResponseEntity<List<CategoryResponseDTO>> findAll() {
		List<CategoryResponseDTO> categories = categoryService.findAll();
		return ResponseEntity.ok(categories);
	}

	@GetMapping("/{id}")
	@PreAuthorize("isAuthenticated()")
	@Operation(summary = "Get category by ID", description = "Returns a single category")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Category found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content) })
	public ResponseEntity<CategoryResponseDTO> findById(
			@Parameter(description = "ID of the category to retrieve") @PathVariable String id) {
		CategoryResponseDTO response = categoryService.findById(id);
		return ResponseEntity.ok(response);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Update a category", description = "Updates an existing category (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Category updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input data", content = @Content),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<CategoryResponseDTO> update(
			@Parameter(description = "ID of the category to update") @PathVariable String id,
			@Valid @RequestBody UpdateCategoryDTO dto) {
		CategoryResponseDTO response = categoryService.update(id, dto);
		return ResponseEntity.ok(response);
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Delete a category", description = "Deletes a category by ID (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Category deleted successfully", content = @Content),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<Void> delete(
			@Parameter(description = "ID of the category to delete") @PathVariable String id) {
		categoryService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\DashboardController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.service.dashboard.DashboardService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/dashboard")
@Tag(name = "Dashboard", description = "Endpoints for dashboard statistics and overview")
public class DashboardController {

	private final DashboardService dashboardService;

	public DashboardController(DashboardService dashboardService) {
		this.dashboardService = dashboardService;
	}

	@GetMapping("/statistics")
	@Operation(summary = "Get general statistics", description = "Returns overall system statistics")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistics retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DashboardStatisticsDTO.class))) })
	public ResponseEntity<DashboardStatisticsDTO> getStatistics() {
		return ResponseEntity.ok(dashboardService.getStatistics());
	}

	@GetMapping("/top-categories")
	@Operation(summary = "Get top categories", description = "Returns the most used categories")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Top categories retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TopCategoryDTO.class))) })
	public ResponseEntity<List<TopCategoryDTO>> getTopCategories() {
		return ResponseEntity.ok(dashboardService.getTopCategories());
	}

	@GetMapping("/top-subcategories")
	@Operation(summary = "Get top subcategories", description = "Returns the most used subcategories")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Top subcategories retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TopSubCategoryDTO.class))) })
	public ResponseEntity<List<TopSubCategoryDTO>> getTopSubCategories() {
		return ResponseEntity.ok(dashboardService.getTopSubCategories());
	}

	@PreAuthorize("hasAnyRole('ADMIN','OPERATOR')")
	@GetMapping("/overview")
	@Operation(summary = "Get dashboard overview", description = "Returns a comprehensive overview (admin/operator only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Overview retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DashboardOverviewDTO.class))),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<DashboardOverviewDTO> overview() {
		return ResponseEntity.ok(dashboardService.getOverview());
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\DepartmentController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.service.department.DepartmentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/departments")
@Tag(name = "Departments", description = "Endpoints for managing departments")
public class DepartmentController {

	private final DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Create a new department", description = "Creates a department (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Department created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<DepartmentResponseDTO> create(@Valid @RequestBody CreateDepartmentDTO dto) {
		DepartmentResponseDTO department = departmentService.create(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(department.getId())
				.toUri();
		return ResponseEntity.created(uri).body(department);
	}

	@GetMapping
	@Operation(summary = "List all departments", description = "Returns a list of all departments")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Departments retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentResponseDTO.class))) })
	public ResponseEntity<List<DepartmentResponseDTO>> findAll() {
		return ResponseEntity.ok(departmentService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get department by ID", description = "Returns a single department")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Department found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Department not found", content = @Content) })
	public ResponseEntity<DepartmentResponseDTO> findById(
			@Parameter(description = "ID of the department") @PathVariable String id) {
		return ResponseEntity.ok(departmentService.findById(id));
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Update a department", description = "Updates an existing department (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Department updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "404", description = "Department not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<DepartmentResponseDTO> update(
			@Parameter(description = "ID of the department to update") @PathVariable String id,
			@Valid @RequestBody UpdateDepartmentDTO dto) {
		return ResponseEntity.ok(departmentService.update(id, dto));
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Delete a department", description = "Deletes a department by ID (admin only)")
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "Department deleted", content = @Content),
			@ApiResponse(responseCode = "404", description = "Department not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<Void> delete(
			@Parameter(description = "ID of the department to delete") @PathVariable String id) {
		departmentService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\FeedbackController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.service.feedback.FeedbackService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/feedbacks")
@Tag(name = "Feedbacks", description = "Endpoints for managing feedbacks on requests")
public class FeedbackController {

	private final FeedbackService feedbackService;

	public FeedbackController(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}

	@PostMapping
	@PreAuthorize("hasRole('CITIZEN')")
	@Operation(summary = "Create a new feedback", description = "Creates a feedback for a request (citizen only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Feedback created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FeedbackResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<FeedbackResponseDTO> create(@Valid @RequestBody CreateFeedbackDTO dto) {
		FeedbackResponseDTO response = feedbackService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all feedbacks", description = "Returns a list of all feedbacks")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Feedbacks retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FeedbackResponseDTO.class))) })
	public ResponseEntity<List<FeedbackResponseDTO>> findAll() {
		return ResponseEntity.ok(feedbackService.findAll());
	}

	@GetMapping("/request/{requestId}")
	@Operation(summary = "Get feedbacks by request ID", description = "Returns all feedbacks for a specific request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Feedbacks retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FeedbackResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<List<FeedbackResponseDTO>> findByRequest(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(feedbackService.findByRequest(requestId));
	}

	@GetMapping("/request/{requestId}/statistics")
	@Operation(summary = "Get feedback statistics for a request", description = "Returns aggregated statistics for a request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistics retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FeedbackStatisticsDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<FeedbackStatisticsDTO> getStatistics(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(feedbackService.getStatistics(requestId));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\LegislationController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.service.legislation.LegislationService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/legislations")
@Tag(name = "Legislations", description = "Endpoints for querying legislation documents")
public class LegislationController {

	private final LegislationService legislationService;

	public LegislationController(LegislationService legislationService) {
		this.legislationService = legislationService;
	}

	@GetMapping
	@Operation(summary = "List all legislations", description = "Returns all legislation documents")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Legislations retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LegislationResponseDTO.class))) })
	public ResponseEntity<List<LegislationResponseDTO>> findAll() {
		return ResponseEntity.ok(legislationService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get legislation by ID", description = "Returns a single legislation document")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Legislation found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LegislationResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Legislation not found", content = @Content) })
	public ResponseEntity<LegislationResponseDTO> findById(
			@Parameter(description = "ID of the legislation") @PathVariable String id) {
		return ResponseEntity.ok(legislationService.findById(id));
	}

	@GetMapping("/search")
	@Operation(summary = "Search legislations by keyword", description = "Returns legislations matching a keyword")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Search results", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LegislationResponseDTO.class))) })
	public ResponseEntity<List<LegislationResponseDTO>> findByKeyword(
			@Parameter(description = "Keyword to search") @RequestParam String keyword) {
		return ResponseEntity.ok(legislationService.findByKeyword(keyword));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\MediaController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.service.media.MediaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/media")
@Tag(name = "Media", description = "Endpoints for managing media files attached to requests")
public class MediaController {

	private final MediaService mediaService;

	public MediaController(MediaService mediaService) {
		this.mediaService = mediaService;
	}

	@PostMapping
	@Operation(summary = "Create a new media entry", description = "Creates a media record (file reference)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Media created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MediaResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content) })
	public ResponseEntity<MediaResponseDTO> create(@Valid @RequestBody CreateMediaDTO dto) {
		MediaResponseDTO response = mediaService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all media", description = "Returns all media records")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Media retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MediaResponseDTO.class))) })
	public ResponseEntity<List<MediaResponseDTO>> findAll() {
		return ResponseEntity.ok(mediaService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get media by ID", description = "Returns a single media record")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Media found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MediaResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Media not found", content = @Content) })
	public ResponseEntity<MediaResponseDTO> findById(
			@Parameter(description = "ID of the media") @PathVariable String id) {
		return ResponseEntity.ok(mediaService.findById(id));
	}

	@GetMapping("/request/{requestId}")
	@Operation(summary = "Get media by request ID", description = "Returns all media for a specific request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Media retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MediaResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<List<MediaResponseDTO>> findByRequest(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(mediaService.findByRequest(requestId));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\RequestController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestStatusDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.service.request.RequestService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/requests")
@Tag(name = "Requests", description = "Endpoints for managing service requests")
public class RequestController {

	private final RequestService requestService;

	public RequestController(RequestService requestService) {
		this.requestService = requestService;
	}

	@PostMapping
	@PreAuthorize("hasRole('CITIZEN')")
	@Operation(summary = "Create a new request", description = "Creates a service request (citizen only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Request created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<RequestResponseDTO> create(@Valid @RequestBody CreateRequestDTO dto) {
		RequestResponseDTO response = requestService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all requests", description = "Returns a list of all requests")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))) })
	public ResponseEntity<List<RequestResponseDTO>> findAll() {
		return ResponseEntity.ok(requestService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get request by ID", description = "Returns a single request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Request found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<RequestResponseDTO> findById(
			@Parameter(description = "ID of the request") @PathVariable String id) {
		return ResponseEntity.ok(requestService.findById(id));
	}

	@GetMapping("/status/{status}")
	@Operation(summary = "Get requests by status", description = "Returns all requests with a given status")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))) })
	public ResponseEntity<List<RequestResponseDTO>> findByStatus(
			@Parameter(description = "Status filter") @PathVariable RequestStatus status) {
		return ResponseEntity.ok(requestService.findByStatus(status));
	}

	@GetMapping("/category/{categoryId}")
	@Operation(summary = "Get requests by category", description = "Returns all requests belonging to a category")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content) })
	public ResponseEntity<List<RequestResponseDTO>> findByCategory(
			@Parameter(description = "Category ID") @PathVariable String categoryId) {
		return ResponseEntity.ok(requestService.findByCategory(categoryId));
	}

	@GetMapping("/subcategory/{subCategoryId}")
	@Operation(summary = "Get requests by subcategory", description = "Returns all requests belonging to a subcategory")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Subcategory not found", content = @Content) })
	public ResponseEntity<List<RequestResponseDTO>> findBySubCategory(
			@Parameter(description = "Subcategory ID") @PathVariable String subCategoryId) {
		return ResponseEntity.ok(requestService.findBySubCategory(subCategoryId));
	}

	@GetMapping("/user/{userId}")
	@Operation(summary = "Get requests by user", description = "Returns all requests created by a specific user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })
	public ResponseEntity<List<RequestResponseDTO>> findByUser(
			@Parameter(description = "User ID") @PathVariable String userId) {
		return ResponseEntity.ok(requestService.findByUser(userId));
	}

	@GetMapping("/department/{departmentId}")
	@PreAuthorize("hasRole('ADMIN') or hasRole('OPERATOR')")
	@Operation(summary = "Get requests by department", description = "Returns all requests assigned to a department (admin/operator only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Requests retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<List<RequestResponseDTO>> findByDepartment(
			@Parameter(description = "Department ID") @PathVariable String departmentId) {
		return ResponseEntity.ok(requestService.findByDepartment(departmentId));
	}

	@GetMapping("/statistics")
	@Operation(summary = "Get global request statistics", description = "Returns overall statistics")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistics retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestStatisticsDTO.class))) })
	public ResponseEntity<RequestStatisticsDTO> getStatistics() {
		return ResponseEntity.ok(requestService.getStatistics());
	}

	@GetMapping("/statistics/category/{categoryId}")
	@Operation(summary = "Get statistics for a category", description = "Returns statistics for requests in a category")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistics retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryStatisticsDTO.class))),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content) })
	public ResponseEntity<CategoryStatisticsDTO> getCategoryStatistics(
			@Parameter(description = "Category ID") @PathVariable String categoryId) {
		return ResponseEntity.ok(requestService.getCategoryStatistics(categoryId));
	}

	@GetMapping("/statistics/subcategory/{subCategoryId}")
	@Operation(summary = "Get statistics for a subcategory", description = "Returns statistics for requests in a subcategory")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistics retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryStatisticsDTO.class))),
			@ApiResponse(responseCode = "404", description = "Subcategory not found", content = @Content) })
	public ResponseEntity<SubCategoryStatisticsDTO> getSubCategoryStatistics(
			@Parameter(description = "Subcategory ID") @PathVariable String subCategoryId) {
		return ResponseEntity.ok(requestService.getSubCategoryStatistics(subCategoryId));
	}

	@GetMapping("/search")
	@Operation(summary = "Search requests with filters and pagination", description = "Returns a paginated list of requests matching filters")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Search results", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))) })
	public ResponseEntity<Page<RequestResponseDTO>> search(
			@Parameter(description = "Filter by status") @RequestParam(required = false) RequestStatus status,
			@Parameter(description = "Filter by category ID") @RequestParam(required = false) String categoryId,
			@Parameter(description = "Filter by subcategory ID") @RequestParam(required = false) String subCategoryId,
			@Parameter(description = "Filter by department ID") @RequestParam(required = false) String departmentId,
			@Parameter(description = "Filter by user ID") @RequestParam(required = false) String userId,
			@Parameter(description = "Page number") @RequestParam(defaultValue = "0") int page,
			@Parameter(description = "Page size") @RequestParam(defaultValue = "10") int size,
			@Parameter(description = "Sort field") @RequestParam(defaultValue = "createdAt") String sortBy,
			@Parameter(description = "Sort direction") @RequestParam(defaultValue = "desc") String direction) {
		Page<RequestResponseDTO> pageResult = requestService.search(status, categoryId, subCategoryId, departmentId,
				userId, page, size, sortBy, direction);
		return ResponseEntity.ok(pageResult);
	}

	@PutMapping("/{id}")
	@PreAuthorize("isAuthenticated()")
	@Operation(summary = "Update a request", description = "Updates an existing request (authenticated user)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Request updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content) })
	public ResponseEntity<RequestResponseDTO> update(
			@Parameter(description = "ID of the request to update") @PathVariable String id,
			@Valid @RequestBody UpdateRequestDTO dto) {
		return ResponseEntity.ok(requestService.update(id, dto));
	}

	@PatchMapping("/{id}/status")
	@PreAuthorize("hasAnyRole('ADMIN','OPERATOR')")
	@Operation(summary = "Update request status", description = "Updates the status of a request (admin/operator only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Status updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid status", content = @Content),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<RequestResponseDTO> updateStatus(
			@Parameter(description = "ID of the request") @PathVariable String id,
			@Valid @RequestBody UpdateRequestStatusDTO dto) {
		return ResponseEntity.ok(requestService.updateStatus(id, dto));
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("isAuthenticated()")
	@Operation(summary = "Delete a request", description = "Deletes a request by ID (authenticated user)")
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "Request deleted", content = @Content),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content) })
	public ResponseEntity<Void> delete(
			@Parameter(description = "ID of the request to delete") @PathVariable String id) {
		requestService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\RequestHistoryController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.service.requesthistory.RequestHistoryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/request-history")
@Tag(name = "Request History", description = "Endpoints for viewing request history")
public class RequestHistoryController {

	private final RequestHistoryService requestHistoryService;

	public RequestHistoryController(RequestHistoryService requestHistoryService) {
		this.requestHistoryService = requestHistoryService;
	}

	@PreAuthorize("hasAnyRole('ADMIN','OPERATOR')")
	@GetMapping("/request/{requestId}")
	@Operation(summary = "Get history of a request", description = "Returns the change history for a specific request (admin/operator only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "History retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestHistoryResponseDTO.class))),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<List<RequestHistoryResponseDTO>> findByRequest(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(requestHistoryService.findByRequest(requestId));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\SubCategoryController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.service.subcategory.SubCategoryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/subcategories")
@Tag(name = "Subcategories", description = "Endpoints for managing subcategories")
public class SubCategoryController {

	private final SubCategoryService subCategoryService;

	public SubCategoryController(SubCategoryService subCategoryService) {
		this.subCategoryService = subCategoryService;
	}

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Create a new subcategory", description = "Creates a subcategory (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Subcategory created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<SubCategoryResponseDTO> create(@Valid @RequestBody CreateSubCategoryDTO dto) {
		SubCategoryResponseDTO response = subCategoryService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all subcategories", description = "Returns a list of all subcategories")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Subcategories retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryResponseDTO.class))) })
	public ResponseEntity<List<SubCategoryResponseDTO>> findAll() {
		return ResponseEntity.ok(subCategoryService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get subcategory by ID", description = "Returns a single subcategory")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Subcategory found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Subcategory not found", content = @Content) })
	public ResponseEntity<SubCategoryResponseDTO> findById(
			@Parameter(description = "ID of the subcategory") @PathVariable String id) {
		return ResponseEntity.ok(subCategoryService.findById(id));
	}

	@GetMapping("/category/{categoryId}")
	@Operation(summary = "Get subcategories by category", description = "Returns all subcategories belonging to a category")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Subcategories retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content) })
	public ResponseEntity<List<SubCategoryResponseDTO>> findByCategory(
			@Parameter(description = "Category ID") @PathVariable String categoryId) {
		return ResponseEntity.ok(subCategoryService.findByCategory(categoryId));
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Update a subcategory", description = "Updates an existing subcategory (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Subcategory updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "404", description = "Subcategory not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<SubCategoryResponseDTO> update(
			@Parameter(description = "ID of the subcategory to update") @PathVariable String id,
			@Valid @RequestBody UpdateSubCategoryDTO dto) {
		return ResponseEntity.ok(subCategoryService.update(id, dto));
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Delete a subcategory", description = "Deletes a subcategory by ID (admin only)")
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "Subcategory deleted", content = @Content),
			@ApiResponse(responseCode = "404", description = "Subcategory not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<Void> delete(
			@Parameter(description = "ID of the subcategory to delete") @PathVariable String id) {
		subCategoryService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\UpdateController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.service.update.UpdateService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/updates")
@Tag(name = "Updates", description = "Endpoints for managing status updates on requests")
public class UpdateController {

	private final UpdateService updateService;

	public UpdateController(UpdateService updateService) {
		this.updateService = updateService;
	}

	@PostMapping
	@PreAuthorize("hasAnyRole('ADMIN','OPERATOR')")
	@Operation(summary = "Create a new update", description = "Creates a status update for a request (admin/operator only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Update created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UpdateResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<UpdateResponseDTO> create(@Valid @RequestBody CreateUpdateDTO dto) {
		UpdateResponseDTO response = updateService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all updates", description = "Returns all updates")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Updates retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UpdateResponseDTO.class))) })
	public ResponseEntity<List<UpdateResponseDTO>> findAll() {
		return ResponseEntity.ok(updateService.findAll());
	}

	@GetMapping("/request/{requestId}")
	@Operation(summary = "Get updates by request ID", description = "Returns all updates for a specific request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Updates retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UpdateResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<List<UpdateResponseDTO>> findByRequest(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(updateService.findByRequest(requestId));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\UserController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.service.user.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
@Tag(name = "Users", description = "Endpoints for managing users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	@Operation(summary = "List all users", description = "Returns a list of all users")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Users retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))) })
	public ResponseEntity<List<UserResponseDTO>> findAll() {
		return ResponseEntity.ok(userService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get user by ID", description = "Returns a single user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })
	public ResponseEntity<UserResponseDTO> findById(
			@Parameter(description = "ID of the user") @PathVariable String id) {
		return ResponseEntity.ok(userService.findById(id));
	}

	@GetMapping("/operators/department/{departmentId}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Get operators by department", description = "Returns operators belonging to a department (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Operators retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<List<UserResponseDTO>> findOperatorsByDepartment(
			@Parameter(description = "Department ID") @PathVariable String departmentId) {
		return ResponseEntity.ok(userService.findOperatorsByDepartment(departmentId));
	}

	@PostMapping
	@Operation(summary = "Create a new user", description = "Creates a user (public registration)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "User created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content) })
	public ResponseEntity<UserResponseDTO> create(@Valid @RequestBody CreateUserDTO dto) {
		UserResponseDTO user = userService.create(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(user);
	}

	@PutMapping("/{id}")
	@Operation(summary = "Update a user", description = "Updates an existing user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })
	public ResponseEntity<UserResponseDTO> update(
			@Parameter(description = "ID of the user to update") @PathVariable String id,
			@Valid @RequestBody UpdateUserDTO dto) {
		return ResponseEntity.ok(userService.update(id, dto));
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "Delete a user", description = "Deletes a user by ID")
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "User deleted", content = @Content),
			@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })
	public ResponseEntity<Void> delete(@Parameter(description = "ID of the user to delete") @PathVariable String id) {
		userService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\controller\VoteController.java

```java
package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.service.vote.VoteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/votes")
@Tag(name = "Votes", description = "Endpoints for managing votes on requests (citizen priority)")
public class VoteController {

	private final VoteService voteService;

	public VoteController(VoteService voteService) {
		this.voteService = voteService;
	}

	@PostMapping
	@PreAuthorize("hasRole('CITIZEN')")
	@Operation(summary = "Create a new vote", description = "Creates a vote for a request (citizen only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Vote created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = VoteResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<VoteResponseDTO> create(@Valid @RequestBody CreateVoteDTO dto) {
		VoteResponseDTO response = voteService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all votes", description = "Returns all votes")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Votes retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = VoteResponseDTO.class))) })
	public ResponseEntity<List<VoteResponseDTO>> findAll() {
		return ResponseEntity.ok(voteService.findAll());
	}

	@GetMapping("/request/{requestId}")
	@Operation(summary = "Get votes by request ID", description = "Returns all votes for a specific request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Votes retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = VoteResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<List<VoteResponseDTO>> findByRequest(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(voteService.findByRequest(requestId));
	}

	@GetMapping("/request/{requestId}/priority")
	@Operation(summary = "Get priority score for a request", description = "Returns the computed priority for a request based on votes")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Priority score retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestPriorityDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<RequestPriorityDTO> getRequestPriority(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(voteService.getRequestPriority(requestId));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\address\AddressDTO.java

```java
package com.iagomoreira.urbanflow.dto.address;

import jakarta.validation.constraints.NotBlank;

public class AddressDTO {

	@NotBlank
	private String cep;

	@NotBlank
	private String street;

	private String number;

	@NotBlank
	private String neighborhood;

	@NotBlank
	private String city;

	@NotBlank
	private String state;

	private String complement;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\address\AddressResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.address;

import java.io.Serializable;

public class AddressResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cep;
	private String street;
	private String number;
	private String neighborhood;
	private String city;
	private String state;
	private String complement;

	public AddressResponseDTO() {
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

}

```

# src\main\java\com\iagomoreira\urbanflow\dto\auth\LoginDTO.java

```java
package com.iagomoreira.urbanflow.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class LoginDTO {

	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email")
	private String email;

	@NotBlank(message = "Password is required")
	private String password;

	public LoginDTO() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\auth\LoginResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.auth;

import java.io.Serializable;

public class LoginResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String token;

	public LoginResponseDTO() {
	}

	public LoginResponseDTO(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\category\CategoryResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.category;

import java.io.Serializable;

public class CategoryResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String description;
	private String departmentId;

	public CategoryResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\category\CategoryStatisticsDTO.java

```java
package com.iagomoreira.urbanflow.dto.category;

import java.io.Serializable;

public class CategoryStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String categoryId;
	private String categoryName;
	private Integer totalRequests;
	private Integer receivedRequests;
	private Integer inProgressRequests;
	private Integer resolvedRequests;
	private Integer cancelledRequests;
	private Double resolutionRate;

	public CategoryStatisticsDTO() {
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Integer totalRequests) {
		this.totalRequests = totalRequests;
	}

	public Integer getReceivedRequests() {
		return receivedRequests;
	}

	public void setReceivedRequests(Integer receivedRequests) {
		this.receivedRequests = receivedRequests;
	}

	public Integer getInProgressRequests() {
		return inProgressRequests;
	}

	public void setInProgressRequests(Integer inProgressRequests) {
		this.inProgressRequests = inProgressRequests;
	}

	public Integer getResolvedRequests() {
		return resolvedRequests;
	}

	public void setResolvedRequests(Integer resolvedRequests) {
		this.resolvedRequests = resolvedRequests;
	}

	public Integer getCancelledRequests() {
		return cancelledRequests;
	}

	public void setCancelledRequests(Integer cancelledRequests) {
		this.cancelledRequests = cancelledRequests;
	}

	public Double getResolutionRate() {
		return resolutionRate;
	}

	public void setResolutionRate(Double resolutionRate) {
		this.resolutionRate = resolutionRate;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\category\CreateCategoryDTO.java

```java
package com.iagomoreira.urbanflow.dto.category;

import jakarta.validation.constraints.NotBlank;

public class CreateCategoryDTO {

	@NotBlank(message = "Category name is required")
	private String name;

	@NotBlank(message = "Category description is required")
	private String description;

	@NotBlank
	private String departmentId;

	public CreateCategoryDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\category\UpdateCategoryDTO.java

```java
package com.iagomoreira.urbanflow.dto.category;

import jakarta.validation.constraints.NotBlank;

public class UpdateCategoryDTO {

	@NotBlank
	private String name;

	@NotBlank
	private String description;

	@NotBlank
	private String departmentId;

	public UpdateCategoryDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\dashboard\DashboardOverviewDTO.java

```java
package com.iagomoreira.urbanflow.dto.dashboard;

import java.io.Serializable;

public class DashboardOverviewDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long totalRequests;
	private Long receivedRequests;
	private Long underReviewRequests;
	private Long approvedRequests;
	private Long inProgressRequests;
	private Long resolvedRequests;
	private Long cancelledRequests;
	private Long rejectedRequests;
	private Long totalUsers;
	private Long totalVotes;

	private Double averageRating;

	public DashboardOverviewDTO() {
	}

	public Long getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Long totalRequests) {
		this.totalRequests = totalRequests;
	}

	public Long getReceivedRequests() {
		return receivedRequests;
	}

	public void setReceivedRequests(Long receivedRequests) {
		this.receivedRequests = receivedRequests;
	}

	public Long getUnderReviewRequests() {
		return underReviewRequests;
	}

	public void setUnderReviewRequests(Long underReviewRequests) {
		this.underReviewRequests = underReviewRequests;
	}

	public Long getApprovedRequests() {
		return approvedRequests;
	}

	public void setApprovedRequests(Long approvedRequests) {
		this.approvedRequests = approvedRequests;
	}

	public Long getInProgressRequests() {
		return inProgressRequests;
	}

	public void setInProgressRequests(Long inProgressRequests) {
		this.inProgressRequests = inProgressRequests;
	}

	public Long getResolvedRequests() {
		return resolvedRequests;
	}

	public void setResolvedRequests(Long resolvedRequests) {
		this.resolvedRequests = resolvedRequests;
	}

	public Long getCancelledRequests() {
		return cancelledRequests;
	}

	public void setCancelledRequests(Long cancelledRequests) {
		this.cancelledRequests = cancelledRequests;
	}

	public Long getRejectedRequests() {
		return rejectedRequests;
	}

	public void setRejectedRequests(Long rejectedRequests) {
		this.rejectedRequests = rejectedRequests;
	}

	public Long getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(Long totalUsers) {
		this.totalUsers = totalUsers;
	}

	public Long getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(Long totalVotes) {
		this.totalVotes = totalVotes;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

}

```

# src\main\java\com\iagomoreira\urbanflow\dto\dashboard\DashboardStatisticsDTO.java

```java
package com.iagomoreira.urbanflow.dto.dashboard;

import java.io.Serializable;

public class DashboardStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer totalRequests;
	private Integer receivedRequests;
	private Integer inProgressRequests;
	private Integer resolvedRequests;
	private Integer cancelledRequests;
	private Double resolutionRate;
	private Integer totalUsers;
	private Integer totalVotes;
	private Integer totalFeedbacks;
	private Double averageRating;

	public DashboardStatisticsDTO() {
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Integer totalRequests) {
		this.totalRequests = totalRequests;
	}

	public Integer getReceivedRequests() {
		return receivedRequests;
	}

	public void setReceivedRequests(Integer receivedRequests) {
		this.receivedRequests = receivedRequests;
	}

	public Integer getInProgressRequests() {
		return inProgressRequests;
	}

	public void setInProgressRequests(Integer inProgressRequests) {
		this.inProgressRequests = inProgressRequests;
	}

	public Integer getResolvedRequests() {
		return resolvedRequests;
	}

	public void setResolvedRequests(Integer resolvedRequests) {
		this.resolvedRequests = resolvedRequests;
	}

	public Integer getCancelledRequests() {
		return cancelledRequests;
	}

	public void setCancelledRequests(Integer cancelledRequests) {
		this.cancelledRequests = cancelledRequests;
	}

	public Double getResolutionRate() {
		return resolutionRate;
	}

	public void setResolutionRate(Double resolutionRate) {
		this.resolutionRate = resolutionRate;
	}

	public Integer getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(Integer totalUsers) {
		this.totalUsers = totalUsers;
	}

	public Integer getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(Integer totalVotes) {
		this.totalVotes = totalVotes;
	}

	public Integer getTotalFeedbacks() {
		return totalFeedbacks;
	}

	public void setTotalFeedbacks(Integer totalFeedbacks) {
		this.totalFeedbacks = totalFeedbacks;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\dashboard\TopCategoryDTO.java

```java
package com.iagomoreira.urbanflow.dto.dashboard;

import java.io.Serializable;

public class TopCategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String categoryId;
	private String categoryName;
	private Integer totalRequests;

	public TopCategoryDTO() {
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Integer totalRequests) {
		this.totalRequests = totalRequests;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\dashboard\TopSubCategoryDTO.java

```java
package com.iagomoreira.urbanflow.dto.dashboard;

import java.io.Serializable;

public class TopSubCategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String subCategoryId;
	private String subCategoryName;
	private Integer totalRequests;

	public TopSubCategoryDTO() {
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Integer totalRequests) {
		this.totalRequests = totalRequests;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\department\CreateDepartmentDTO.java

```java
package com.iagomoreira.urbanflow.dto.department;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;

public class CreateDepartmentDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String name;

	@NotBlank
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\department\DepartmentResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.department;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DepartmentResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String description;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public DepartmentResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\department\UpdateDepartmentDTO.java

```java
package com.iagomoreira.urbanflow.dto.department;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;

public class UpdateDepartmentDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String name;

	@NotBlank
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\feedback\CreateFeedbackDTO.java

```java
package com.iagomoreira.urbanflow.dto.feedback;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateFeedbackDTO {

	@Min(1)
	@Max(5)
	private Integer rating;

	@Size(max = 500)
	private String comment;

	@NotBlank
	private String requestId;

	public CreateFeedbackDTO() {
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\feedback\FeedbackResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.feedback;

import java.io.Serializable;
import java.time.LocalDateTime;

public class FeedbackResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private Integer rating;
	private String comment;
	private LocalDateTime createdAt;
	private String userId;
	private String requestId;

	public FeedbackResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\feedback\FeedbackStatisticsDTO.java

```java
package com.iagomoreira.urbanflow.dto.feedback;

import java.io.Serializable;

public class FeedbackStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double averageRating;
	private Integer totalFeedbacks;
	private Integer fiveStars;
	private Integer fourStars;
	private Integer threeStars;
	private Integer twoStars;
	private Integer oneStar;

	private Double satisfactionPercentage;

	public FeedbackStatisticsDTO() {
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public Integer getTotalFeedbacks() {
		return totalFeedbacks;
	}

	public void setTotalFeedbacks(Integer totalFeedbacks) {
		this.totalFeedbacks = totalFeedbacks;
	}

	public Integer getFiveStars() {
		return fiveStars;
	}

	public void setFiveStars(Integer fiveStars) {
		this.fiveStars = fiveStars;
	}

	public Integer getFourStars() {
		return fourStars;
	}

	public void setFourStars(Integer fourStars) {
		this.fourStars = fourStars;
	}

	public Integer getThreeStars() {
		return threeStars;
	}

	public void setThreeStars(Integer threeStars) {
		this.threeStars = threeStars;
	}

	public Integer getTwoStars() {
		return twoStars;
	}

	public void setTwoStars(Integer twoStars) {
		this.twoStars = twoStars;
	}

	public Integer getOneStar() {
		return oneStar;
	}

	public void setOneStar(Integer oneStar) {
		this.oneStar = oneStar;
	}

	public Double getSatisfactionPercentage() {
		return satisfactionPercentage;
	}

	public void setSatisfactionPercentage(Double satisfactionPercentage) {
		this.satisfactionPercentage = satisfactionPercentage;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\legislation\LegislationResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.legislation;

import java.io.Serializable;
import java.util.List;

public class LegislationResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String title;
	private String description;
	private String documentUrl;
	private List<String> keywords;

	public LegislationResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocumentUrl() {
		return documentUrl;
	}

	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\media\CreateMediaDTO.java

```java
package com.iagomoreira.urbanflow.dto.media;

import com.iagomoreira.urbanflow.model.enums.MediaType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateMediaDTO {

	@NotNull
	private MediaType type;

	@NotBlank
	private String url;

	@NotBlank
	private String requestId;

	public CreateMediaDTO() {
	}

	public MediaType getType() {
		return type;
	}

	public void setType(MediaType type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\media\MediaResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.media;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.enums.MediaType;

public class MediaResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private MediaType type;
	private String url;
	private LocalDateTime uploadedAt;
	private String requestId;

	public MediaResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MediaType getType() {
		return type;
	}

	public void setType(MediaType type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDateTime getUploadedAt() {
		return uploadedAt;
	}

	public void setUploadedAt(LocalDateTime uploadedAt) {
		this.uploadedAt = uploadedAt;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\request\CreateRequestDTO.java

```java
package com.iagomoreira.urbanflow.dto.request;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateRequestDTO {

	@NotBlank
	private String title;

	@NotBlank
	private String description;

	@NotBlank
	private String categoryId;

	@NotBlank
	private String subCategoryId;

	@NotNull
	private PriorityLevel citizenPriority;

	@NotNull
	private Double latitude;

	@NotNull
	private Double longitude;

	@Valid
	private AddressDTO address;

	public CreateRequestDTO() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public PriorityLevel getCitizenPriority() {
		return citizenPriority;
	}

	public void setCitizenPriority(PriorityLevel citizenPriority) {
		this.citizenPriority = citizenPriority;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\request\RequestDetailsDTO.java

```java
package com.iagomoreira.urbanflow.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class RequestDetailsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String title;
	private String description;
	private RequestStatus status;
	private PriorityLevel citizenPriority;
	private Double latitude;
	private Double longitude;
	private AddressResponseDTO address;
	private LocalDateTime createdAt;
	private String categoryId;
	private String subCategoryId;
	private List<String> legislationIds;

	public RequestDetailsDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public PriorityLevel getCitizenPriority() {
		return citizenPriority;
	}

	public void setCitizenPriority(PriorityLevel citizenPriority) {
		this.citizenPriority = citizenPriority;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public AddressResponseDTO getAddress() {
		return address;
	}

	public void setAddress(AddressResponseDTO address) {
		this.address = address;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public List<String> getLegislationIds() {
		return legislationIds;
	}

	public void setLegislationIds(List<String> legislationIds) {
		this.legislationIds = legislationIds;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\request\RequestFilterDTO.java

```java
package com.iagomoreira.urbanflow.dto.request;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class RequestFilterDTO {

	private RequestStatus status;
	private String categoryId;
	private String subCategoryId;
	private String userId;

	public RequestFilterDTO() {
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\request\RequestResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class RequestResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String title;
	private String description;
	private String userId;
	private String categoryId;
	private String subCategoryId;
	private PriorityLevel citizenPriority;
	private RequestStatus status;
	private Double latitude;
	private Double longitude;
	private AddressResponseDTO address;
	private String departmentId;
	private LocalDateTime createdAt;

	public RequestResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public PriorityLevel getCitizenPriority() {
		return citizenPriority;
	}

	public void setCitizenPriority(PriorityLevel citizenPriority) {
		this.citizenPriority = citizenPriority;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public AddressResponseDTO getAddress() {
		return address;
	}

	public void setAddress(AddressResponseDTO address) {
		this.address = address;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\request\RequestStatisticsDTO.java

```java
package com.iagomoreira.urbanflow.dto.request;

import java.io.Serializable;

public class RequestStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer totalRequests;
	private Integer receivedRequests;
	private Integer inProgressRequests;
	private Integer resolvedRequests;
	private Integer cancelledRequests;
	private Double resolutionRate;

	public RequestStatisticsDTO() {
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Integer totalRequests) {
		this.totalRequests = totalRequests;
	}

	public Integer getReceivedRequests() {
		return receivedRequests;
	}

	public void setReceivedRequests(Integer receivedRequests) {
		this.receivedRequests = receivedRequests;
	}

	public Integer getInProgressRequests() {
		return inProgressRequests;
	}

	public void setInProgressRequests(Integer inProgressRequests) {
		this.inProgressRequests = inProgressRequests;
	}

	public Integer getResolvedRequests() {
		return resolvedRequests;
	}

	public void setResolvedRequests(Integer resolvedRequests) {
		this.resolvedRequests = resolvedRequests;
	}

	public Integer getCancelledRequests() {
		return cancelledRequests;
	}

	public void setCancelledRequests(Integer cancelledRequests) {
		this.cancelledRequests = cancelledRequests;
	}

	public Double getResolutionRate() {
		return resolutionRate;
	}

	public void setResolutionRate(Double resolutionRate) {
		this.resolutionRate = resolutionRate;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\request\UpdateRequestDTO.java

```java
package com.iagomoreira.urbanflow.dto.request;

import jakarta.validation.constraints.NotBlank;

public class UpdateRequestDTO {

	@NotBlank
	private String title;

	@NotBlank
	private String description;

	public UpdateRequestDTO() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\request\UpdateRequestStatusDTO.java

```java
package com.iagomoreira.urbanflow.dto.request;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

import jakarta.validation.constraints.NotNull;

public class UpdateRequestStatusDTO {

	@NotNull(message = "Status is required")
	private RequestStatus status;

	private String note;

	public UpdateRequestStatusDTO() {
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\requesthistory\RequestHistoryResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.requesthistory;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class RequestHistoryResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private RequestStatus oldStatus;
	private RequestStatus newStatus;
	private String changedBy;
	private String note;
	private LocalDateTime changedAt;

	public RequestHistoryResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RequestStatus getOldStatus() {
		return oldStatus;
	}

	public void setOldStatus(RequestStatus oldStatus) {
		this.oldStatus = oldStatus;
	}

	public RequestStatus getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(RequestStatus newStatus) {
		this.newStatus = newStatus;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public LocalDateTime getChangedAt() {
		return changedAt;
	}

	public void setChangedAt(LocalDateTime changedAt) {
		this.changedAt = changedAt;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\subcategory\CreateSubCategoryDTO.java

```java
package com.iagomoreira.urbanflow.dto.subcategory;

import jakarta.validation.constraints.NotBlank;

public class CreateSubCategoryDTO {

	@NotBlank(message = "Subcategory name is required")
	private String name;

	@NotBlank(message = "Subcategory description is required")
	private String description;

	@NotBlank(message = "Category id is required")
	private String categoryId;

	@NotBlank(message = "Department is required")
	private String departmentId;

	public CreateSubCategoryDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\subcategory\SubCategoryResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.subcategory;

import java.io.Serializable;

public class SubCategoryResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String description;
	private String categoryId;
	private String departmentId;

	public SubCategoryResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\subcategory\SubCategoryStatisticsDTO.java

```java
package com.iagomoreira.urbanflow.dto.subcategory;

import java.io.Serializable;

public class SubCategoryStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String subCategoryId;
	private String subCategoryName;
	private Integer totalRequests;
	private Integer receivedRequests;
	private Integer inProgressRequests;
	private Integer resolvedRequests;
	private Integer cancelledRequests;
	private Double resolutionRate;

	public SubCategoryStatisticsDTO() {
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Integer totalRequests) {
		this.totalRequests = totalRequests;
	}

	public Integer getReceivedRequests() {
		return receivedRequests;
	}

	public void setReceivedRequests(Integer receivedRequests) {
		this.receivedRequests = receivedRequests;
	}

	public Integer getInProgressRequests() {
		return inProgressRequests;
	}

	public void setInProgressRequests(Integer inProgressRequests) {
		this.inProgressRequests = inProgressRequests;
	}

	public Integer getResolvedRequests() {
		return resolvedRequests;
	}

	public void setResolvedRequests(Integer resolvedRequests) {
		this.resolvedRequests = resolvedRequests;
	}

	public Integer getCancelledRequests() {
		return cancelledRequests;
	}

	public void setCancelledRequests(Integer cancelledRequests) {
		this.cancelledRequests = cancelledRequests;
	}

	public Double getResolutionRate() {
		return resolutionRate;
	}

	public void setResolutionRate(Double resolutionRate) {
		this.resolutionRate = resolutionRate;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\subcategory\UpdateSubCategoryDTO.java

```java
package com.iagomoreira.urbanflow.dto.subcategory;

import jakarta.validation.constraints.NotBlank;

public class UpdateSubCategoryDTO {

	@NotBlank
	private String name;

	@NotBlank
	private String description;

	@NotBlank
	private String categoryId;

	@NotBlank
	private String departmentId;

	public UpdateSubCategoryDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\update\CreateUpdateDTO.java

```java
package com.iagomoreira.urbanflow.dto.update;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateUpdateDTO {

	@NotNull
	private RequestStatus status;

	@NotBlank
	private String description;

	@NotBlank
	private String requestId;

	public CreateUpdateDTO() {
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\update\UpdateResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.update;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class UpdateResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private RequestStatus status;
	private String description;
	private LocalDateTime updatedAt;
	private String requestId;

	public UpdateResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\dto\user\CreateUserDTO.java

```java
package com.iagomoreira.urbanflow.dto.user;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.validation.ValidCpf;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CreateUserDTO {

	@NotBlank
	private String name;

	@Email
	@NotBlank
	private String email;

	@NotBlank
	@ValidCpf
	private String cpf;

	@NotBlank
	private String password;

	@Valid
	private AddressDTO address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\user\UpdateUserDTO.java

```java
package com.iagomoreira.urbanflow.dto.user;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UpdateUserDTO {

	@NotBlank
	private String name;

	@Email
	@NotBlank
	private String email;

	private String password;

	@Valid
	private AddressDTO address;

	public UpdateUserDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\user\UserResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.user;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.enums.Role;

public class UserResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String email;
	private Role role;
	private String departmentId;
	private AddressResponseDTO address;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public UserResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public AddressResponseDTO getAddress() {
		return address;
	}

	public void setAddress(AddressResponseDTO address) {
		this.address = address;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\vote\CreateVoteDTO.java

```java
package com.iagomoreira.urbanflow.dto.vote;

import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateVoteDTO {

	@NotBlank
	private String requestId;

	@NotNull
	private PriorityLevel priorityLevel;

	public CreateVoteDTO() {
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(PriorityLevel priorityLevel) {
		this.priorityLevel = priorityLevel;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\vote\RequestPriorityDTO.java

```java
package com.iagomoreira.urbanflow.dto.vote;

import java.io.Serializable;

public class RequestPriorityDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer lowVotes;
	private Integer mediumVotes;
	private Integer highVotes;
	private Integer totalVotes;
	private Double lowPercentage;
	private Double mediumPercentage;
	private Double highPercentage;

	public RequestPriorityDTO() {
	}

	public Integer getLowVotes() {
		return lowVotes;
	}

	public void setLowVotes(Integer lowVotes) {
		this.lowVotes = lowVotes;
	}

	public Integer getMediumVotes() {
		return mediumVotes;
	}

	public void setMediumVotes(Integer mediumVotes) {
		this.mediumVotes = mediumVotes;
	}

	public Integer getHighVotes() {
		return highVotes;
	}

	public void setHighVotes(Integer highVotes) {
		this.highVotes = highVotes;
	}

	public Integer getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(Integer totalVotes) {
		this.totalVotes = totalVotes;
	}

	public Double getLowPercentage() {
		return lowPercentage;
	}

	public void setLowPercentage(Double lowPercentage) {
		this.lowPercentage = lowPercentage;
	}

	public Double getMediumPercentage() {
		return mediumPercentage;
	}

	public void setMediumPercentage(Double mediumPercentage) {
		this.mediumPercentage = mediumPercentage;
	}

	public Double getHighPercentage() {
		return highPercentage;
	}

	public void setHighPercentage(Double highPercentage) {
		this.highPercentage = highPercentage;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\dto\vote\VoteResponseDTO.java

```java
package com.iagomoreira.urbanflow.dto.vote;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

public class VoteResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String userId;
	private String requestId;
	private PriorityLevel priorityLevel;
	private LocalDateTime createdAt;

	public VoteResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRequestId() {
		return requestId;
	}

	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public void setPriorityLevel(PriorityLevel priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\exception\BusinessException.java

```java
package com.iagomoreira.urbanflow.exception;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BusinessException(String message) {
		super(message);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\exception\DatabaseException.java

```java
package com.iagomoreira.urbanflow.exception;

public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DatabaseException(String message) {
		super(message);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\exception\FieldMessage.java

```java
package com.iagomoreira.urbanflow.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	private String field;
	private String message;

	public FieldMessage() {
	}

	public FieldMessage(String field, String message) {
		super();
		this.field = field;
		this.message = message;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\exception\GlobalExceptionHandler.java

```java
package com.iagomoreira.urbanflow.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {

		StandardError error = new StandardError(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), e.getMessage(),
				request.getRequestURI(), null);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> databaseException(DatabaseException e, HttpServletRequest request) {

		StandardError error = new StandardError(LocalDateTime.now(), HttpStatus.BAD_REQUEST.value(), e.getMessage(),
				request.getRequestURI(), null);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ValidationError> validation(MethodArgumentNotValidException e, HttpServletRequest request) {

		ValidationError error = new ValidationError(LocalDateTime.now(), HttpStatus.BAD_REQUEST.value(),
				"Validation error", e.getMessage(), request.getRequestURI());

		for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
			error.addError(fieldError.getField(), fieldError.getDefaultMessage());
		}

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}

	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<StandardError> businessException(BusinessException e, HttpServletRequest request) {

		StandardError error = new StandardError(LocalDateTime.now(), HttpStatus.BAD_REQUEST.value(),
				"Business Rule Violation", e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\exception\ResourceNotFoundException.java

```java
package com.iagomoreira.urbanflow.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\exception\StandardError.java

```java
package com.iagomoreira.urbanflow.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private LocalDateTime timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;

	public StandardError() {
	}

	public StandardError(LocalDateTime timestamp, Integer status, String error, String message, String path) {
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\exception\ValidationError.java

```java
package com.iagomoreira.urbanflow.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	private static final long serialVersionUID = 1L;

	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError() {
	}

	public ValidationError(LocalDateTime timestamp, Integer status, String error, String message, String path) {
		super(timestamp, status, error, message, path);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String field, String message) {
		errors.add(new FieldMessage(field, message));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\AddressMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.Address;

@Component
public class AddressMapper {

	public Address toEntity(AddressDTO dto) {

		if (dto == null) {
			return null;
		}

		Address address = new Address();

		address.setCep(dto.getCep());
		address.setStreet(dto.getStreet());
		address.setNumber(dto.getNumber());
		address.setNeighborhood(dto.getNeighborhood());
		address.setCity(dto.getCity());
		address.setState(dto.getState());
		address.setComplement(dto.getComplement());

		return address;
	}

	public AddressResponseDTO toResponse(Address address) {

		if (address == null) {
			return null;
		}

		AddressResponseDTO dto = new AddressResponseDTO();

		dto.setCep(address.getCep());
		dto.setStreet(address.getStreet());
		dto.setNumber(address.getNumber());
		dto.setNeighborhood(address.getNeighborhood());
		dto.setCity(address.getCity());
		dto.setState(address.getState());
		dto.setComplement(address.getComplement());

		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\CategoryMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.model.Category;

@Component
public class CategoryMapper {

	public Category toEntity(CreateCategoryDTO dto) {
		Category category = new Category();
		category.setName(dto.getName());
		category.setDescription(dto.getDescription());
		category.setDepartmentId(dto.getDepartmentId());
		return category;
	}

	public void updateEntity(Category category, UpdateCategoryDTO dto) {
		category.setName(dto.getName());
		category.setDescription(dto.getDescription());
		category.setDepartmentId(dto.getDepartmentId());
	}

	public CategoryResponseDTO toResponse(Category category) {

		if (category == null) {
			return null;
		}

		CategoryResponseDTO dto = new CategoryResponseDTO();
		dto.setId(category.getId());
		dto.setName(category.getName());
		dto.setDescription(category.getDescription());
		dto.setDepartmentId(category.getDepartmentId());
		return dto;
	}

	public CategoryStatisticsDTO toStatisticsResponse(String categoryId, String categoryName, Integer totalRequests,
			Integer receivedRequests, Integer inProgressRequests, Integer resolvedRequests, Integer cancelledRequests,
			Double resolutionRate) {
		CategoryStatisticsDTO dto = new CategoryStatisticsDTO();
		dto.setCategoryId(categoryId);
		dto.setCategoryName(categoryName);
		dto.setTotalRequests(totalRequests);
		dto.setReceivedRequests(receivedRequests);
		dto.setInProgressRequests(inProgressRequests);
		dto.setResolvedRequests(resolvedRequests);
		dto.setCancelledRequests(cancelledRequests);
		dto.setResolutionRate(resolutionRate);
		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\DashboardMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;

@Component
public class DashboardMapper {

	public DashboardStatisticsDTO toStatisticsResponse(Integer totalRequests, Integer receivedRequests,
			Integer inProgressRequests, Integer resolvedRequests, Integer cancelledRequests, Double resolutionRate,
			Integer totalUsers, Integer totalVotes, Integer totalFeedbacks, Double averageRating) {
		DashboardStatisticsDTO dto = new DashboardStatisticsDTO();
		dto.setTotalRequests(totalRequests);
		dto.setReceivedRequests(receivedRequests);
		dto.setInProgressRequests(inProgressRequests);
		dto.setResolvedRequests(resolvedRequests);
		dto.setCancelledRequests(cancelledRequests);
		dto.setResolutionRate(resolutionRate);
		dto.setTotalUsers(totalUsers);
		dto.setTotalVotes(totalVotes);
		dto.setTotalFeedbacks(totalFeedbacks);
		dto.setAverageRating(averageRating);
		return dto;
	}

	public DashboardOverviewDTO toOverviewResponse(Long totalRequests, Long receivedRequests, Long underReviewRequests,
			Long approvedRequests, Long inProgressRequests, Long resolvedRequests, Long cancelledRequests,
			Long rejectedRequests, Long totalUsers, Long totalVotes, Double averageRating) {
		DashboardOverviewDTO dto = new DashboardOverviewDTO();
		dto.setTotalRequests(totalRequests);
		dto.setReceivedRequests(receivedRequests);
		dto.setUnderReviewRequests(underReviewRequests);
		dto.setApprovedRequests(approvedRequests);
		dto.setInProgressRequests(inProgressRequests);
		dto.setResolvedRequests(resolvedRequests);
		dto.setCancelledRequests(cancelledRequests);
		dto.setRejectedRequests(rejectedRequests);
		dto.setTotalUsers(totalUsers);
		dto.setTotalVotes(totalVotes);
		dto.setAverageRating(averageRating);
		return dto;
	}

	public TopCategoryDTO toTopCategoryResponse(String categoryId, String categoryName, Integer totalRequests) {
		TopCategoryDTO dto = new TopCategoryDTO();
		dto.setCategoryId(categoryId);
		dto.setCategoryName(categoryName);
		dto.setTotalRequests(totalRequests);
		return dto;
	}

	public TopSubCategoryDTO toTopSubCategoryResponse(String subCategoryId, String subCategoryName,
			Integer totalRequests) {
		TopSubCategoryDTO dto = new TopSubCategoryDTO();
		dto.setSubCategoryId(subCategoryId);
		dto.setSubCategoryName(subCategoryName);
		dto.setTotalRequests(totalRequests);
		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\DepartmentMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.model.Department;

@Component
public class DepartmentMapper {

	public Department toEntity(CreateDepartmentDTO dto) {
		Department department = new Department();
		department.setName(dto.getName());
		department.setDescription(dto.getDescription());
		return department;
	}

	public void updateEntity(Department department, UpdateDepartmentDTO dto) {
		department.setName(dto.getName());
		department.setDescription(dto.getDescription());
	}

	public DepartmentResponseDTO toResponse(Department department) {

		if (department == null) {
			return null;
		}

		DepartmentResponseDTO dto = new DepartmentResponseDTO();
		dto.setId(department.getId());
		dto.setName(department.getName());
		dto.setDescription(department.getDescription());
		dto.setCreatedAt(department.getCreatedAt());
		dto.setUpdatedAt(department.getUpdatedAt());
		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\FeedbackMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.model.Feedback;

@Component
public class FeedbackMapper {

	public Feedback toEntity(CreateFeedbackDTO dto) {
		Feedback feedback = new Feedback();
		feedback.setRating(dto.getRating());
		feedback.setComment(dto.getComment());
		feedback.setRequestId(dto.getRequestId());
		return feedback;
	}

	public FeedbackResponseDTO toResponse(Feedback feedback) {

		if (feedback == null) {
			return null;
		}

		FeedbackResponseDTO dto = new FeedbackResponseDTO();
		dto.setId(feedback.getId());
		dto.setRating(feedback.getRating());
		dto.setComment(feedback.getComment());
		dto.setCreatedAt(feedback.getCreatedAt());
		dto.setUserId(feedback.getUserId());
		dto.setRequestId(feedback.getRequestId());
		return dto;
	}

	public FeedbackStatisticsDTO toStatisticsResponse(Double averageRating, Integer totalFeedbacks, Integer fiveStars,
			Integer fourStars, Integer threeStars, Integer twoStars, Integer oneStar, Double satisfactionPercentage) {
		FeedbackStatisticsDTO dto = new FeedbackStatisticsDTO();
		dto.setAverageRating(averageRating);
		dto.setTotalFeedbacks(totalFeedbacks);
		dto.setFiveStars(fiveStars);
		dto.setFourStars(fourStars);
		dto.setThreeStars(threeStars);
		dto.setTwoStars(twoStars);
		dto.setOneStar(oneStar);
		dto.setSatisfactionPercentage(satisfactionPercentage);
		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\LegislationMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.model.Legislation;

@Component
public class LegislationMapper {

	public LegislationResponseDTO toResponse(Legislation legislation) {

		if (legislation == null) {
			return null;
		}

		LegislationResponseDTO dto = new LegislationResponseDTO();
		dto.setId(legislation.getId());
		dto.setTitle(legislation.getTitle());
		dto.setDescription(legislation.getDescription());
		dto.setDocumentUrl(legislation.getDocumentUrl());
		dto.setKeywords(legislation.getKeywords());
		return dto;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\mapper\MediaMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.model.Media;

@Component
public class MediaMapper {

	public Media toEntity(CreateMediaDTO dto) {
		Media media = new Media();
		media.setType(dto.getType());
		media.setUrl(dto.getUrl());
		media.setRequestId(dto.getRequestId());
		return media;
	}

	public MediaResponseDTO toResponse(Media media) {

		if (media == null) {
			return null;
		}

		MediaResponseDTO dto = new MediaResponseDTO();
		dto.setId(media.getId());
		dto.setType(media.getType());
		dto.setUrl(media.getUrl());
		dto.setUploadedAt(media.getUploadedAt());
		dto.setRequestId(media.getRequestId());
		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\RequestHistoryMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.model.RequestHistory;

@Component
public class RequestHistoryMapper {

	public RequestHistoryResponseDTO toResponse(RequestHistory history) {

		if (history == null) {
			return null;
		}

		RequestHistoryResponseDTO dto = new RequestHistoryResponseDTO();
		dto.setId(history.getId());
		dto.setOldStatus(history.getOldStatus());
		dto.setNewStatus(history.getNewStatus());
		dto.setChangedBy(history.getChangedBy());
		dto.setNote(history.getNote());
		dto.setChangedAt(history.getChangedAt());
		return dto;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\mapper\RequestMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestDetailsDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.model.Request;

@Component
public class RequestMapper {

	private final AddressMapper addressMapper;

	public RequestMapper(AddressMapper addressMapper) {
		this.addressMapper = addressMapper;
	}

	public Request toEntity(CreateRequestDTO dto) {
		Request request = new Request();
		request.setTitle(dto.getTitle());
		request.setDescription(dto.getDescription());
		request.setCategoryId(dto.getCategoryId());
		request.setSubCategoryId(dto.getSubCategoryId());
		request.setCitizenPriority(dto.getCitizenPriority());
		request.setLatitude(dto.getLatitude());
		request.setLongitude(dto.getLongitude());
		request.setAddress(addressMapper.toEntity(dto.getAddress()));
		return request;
	}

	public void updateEntity(Request request, UpdateRequestDTO dto) {
		request.setTitle(dto.getTitle());
		request.setDescription(dto.getDescription());
	}

	public RequestResponseDTO toResponse(Request request) {
		RequestResponseDTO dto = new RequestResponseDTO();
		dto.setId(request.getId());
		dto.setTitle(request.getTitle());
		dto.setDescription(request.getDescription());
		dto.setUserId(request.getUserId());
		dto.setCategoryId(request.getCategoryId());
		dto.setSubCategoryId(request.getSubCategoryId());
		dto.setCitizenPriority(request.getCitizenPriority());
		dto.setStatus(request.getStatus());
		dto.setLatitude(request.getLatitude());
		dto.setLongitude(request.getLongitude());

		if (request.getAddress() != null) {
			dto.setAddress(addressMapper.toResponse(request.getAddress()));
		}

		dto.setDepartmentId(request.getDepartmentId());
		dto.setCreatedAt(request.getCreatedAt());
		return dto;
	}

	public RequestDetailsDTO toDetailsResponse(Request request) {
		RequestDetailsDTO dto = new RequestDetailsDTO();
		dto.setId(request.getId());
		dto.setTitle(request.getTitle());
		dto.setDescription(request.getDescription());
		dto.setStatus(request.getStatus());
		dto.setCitizenPriority(request.getCitizenPriority());
		dto.setLatitude(request.getLatitude());
		dto.setLongitude(request.getLongitude());
		dto.setCreatedAt(request.getCreatedAt());
		dto.setCategoryId(request.getCategoryId());
		dto.setSubCategoryId(request.getSubCategoryId());

		if (request.getAddress() != null) {
			dto.setAddress(addressMapper.toResponse(request.getAddress()));
		}

		dto.setLegislationIds(request.getLegislationIds());
		return dto;
	}

	public RequestStatisticsDTO toStatisticsResponse(Integer totalRequests, Integer receivedRequests,
			Integer inProgressRequests, Integer resolvedRequests, Integer cancelledRequests, Double resolutionRate) {
		RequestStatisticsDTO dto = new RequestStatisticsDTO();
		dto.setTotalRequests(totalRequests);
		dto.setReceivedRequests(receivedRequests);
		dto.setInProgressRequests(inProgressRequests);
		dto.setResolvedRequests(resolvedRequests);
		dto.setCancelledRequests(cancelledRequests);
		dto.setResolutionRate(resolutionRate);
		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\SubCategoryMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.model.SubCategory;

@Component
public class SubCategoryMapper {

	public SubCategory toEntity(CreateSubCategoryDTO dto) {

		SubCategory subCategory = new SubCategory();

		subCategory.setName(dto.getName());
		subCategory.setDescription(dto.getDescription());
		subCategory.setCategoryId(dto.getCategoryId());
		subCategory.setDepartmentId(dto.getDepartmentId());

		return subCategory;
	}

	public void updateEntity(SubCategory subCategory, UpdateSubCategoryDTO dto) {
		subCategory.setName(dto.getName());
		subCategory.setDescription(dto.getDescription());
		subCategory.setCategoryId(dto.getCategoryId());
		subCategory.setDepartmentId(dto.getDepartmentId());
	}

	public SubCategoryResponseDTO toResponse(SubCategory subCategory) {

		if (subCategory == null) {
			return null;
		}

		SubCategoryResponseDTO dto = new SubCategoryResponseDTO();
		dto.setId(subCategory.getId());
		dto.setName(subCategory.getName());
		dto.setDescription(subCategory.getDescription());
		dto.setCategoryId(subCategory.getCategoryId());
		dto.setDepartmentId(subCategory.getDepartmentId());
		return dto;
	}

	public SubCategoryStatisticsDTO toStatisticsResponse(String subCategoryId, String subCategoryName,
			Integer totalRequests, Integer receivedRequests, Integer inProgressRequests, Integer resolvedRequests,
			Integer cancelledRequests, Double resolutionRate) {
		SubCategoryStatisticsDTO dto = new SubCategoryStatisticsDTO();
		dto.setSubCategoryId(subCategoryId);
		dto.setSubCategoryName(subCategoryName);
		dto.setTotalRequests(totalRequests);
		dto.setReceivedRequests(receivedRequests);
		dto.setInProgressRequests(inProgressRequests);
		dto.setResolvedRequests(resolvedRequests);
		dto.setCancelledRequests(cancelledRequests);
		dto.setResolutionRate(resolutionRate);
		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\UpdateMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.model.Update;

@Component
public class UpdateMapper {

	public Update toEntity(CreateUpdateDTO dto) {
		Update update = new Update();
		update.setStatus(dto.getStatus());
		update.setDescription(dto.getDescription());
		update.setRequestId(dto.getRequestId());

		return update;
	}

	public UpdateResponseDTO toResponse(Update update) {

		if (update == null) {
			return null;
		}

		UpdateResponseDTO dto = new UpdateResponseDTO();
		dto.setId(update.getId());
		dto.setStatus(update.getStatus());
		dto.setDescription(update.getDescription());
		dto.setUpdatedAt(update.getUpdatedAt());
		dto.setRequestId(update.getRequestId());
		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\UserMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.model.User;

@Component
public class UserMapper {

	private final AddressMapper addressMapper;

	public UserMapper(AddressMapper addressMapper) {
		this.addressMapper = addressMapper;
	}

	public User toEntity(CreateUserDTO dto, String encodedPassword) {

		User user = new User();

		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setPassword(encodedPassword);
		user.setCpf(dto.getCpf());

		if (dto.getAddress() != null) {
			user.setAddress(addressMapper.toEntity(dto.getAddress()));
		}

		return user;
	}

	public void updateEntity(User user, UpdateUserDTO dto) {

		user.setName(dto.getName());
		user.setEmail(dto.getEmail());

		if (dto.getAddress() != null) {
			user.setAddress(addressMapper.toEntity(dto.getAddress()));
		}
	}

	public UserResponseDTO toResponse(User user) {

		if (user == null) {
			return null;
		}

		UserResponseDTO dto = new UserResponseDTO();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		dto.setRole(user.getRole());
		dto.setDepartmentId(user.getDepartmentId());

		if (user.getAddress() != null) {
			dto.setAddress(addressMapper.toResponse(user.getAddress()));
		}

		dto.setCreatedAt(user.getCreatedAt());
		dto.setUpdatedAt(user.getUpdatedAt());
		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\mapper\VoteMapper.java

```java
package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.model.Vote;

@Component
public class VoteMapper {

	public Vote toEntity(CreateVoteDTO dto, String userId) {

		Vote vote = new Vote();

		vote.setUserId(userId);
		vote.setRequestId(dto.getRequestId());
		vote.setPriorityLevel(dto.getPriorityLevel());

		return vote;
	}

	public VoteResponseDTO toResponse(Vote vote) {

		if (vote == null) {
			return null;
		}

		VoteResponseDTO dto = new VoteResponseDTO();
		dto.setId(vote.getId());
		dto.setUserId(vote.getUserId());
		dto.setRequestId(vote.getRequestId());
		dto.setPriorityLevel(vote.getPriorityLevel());
		dto.setCreatedAt(vote.getCreatedAt());
		return dto;
	}

	public RequestPriorityDTO toPriorityResponse(Integer lowVotes, Integer mediumVotes, Integer highVotes,
			Integer totalVotes, Double lowPercentage, Double mediumPercentage, Double highPercentage) {
		RequestPriorityDTO dto = new RequestPriorityDTO();
		dto.setLowVotes(lowVotes);
		dto.setMediumVotes(mediumVotes);
		dto.setHighVotes(highVotes);
		dto.setTotalVotes(totalVotes);
		dto.setLowPercentage(lowPercentage);
		dto.setMediumPercentage(mediumPercentage);
		dto.setHighPercentage(highPercentage);
		return dto;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\model\Address.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cep;
	private String street;
	private String number;
	private String neighborhood;
	private String city;
	private String state;
	private String complement;

	public Address() {
	}

	public Address(String cep, String street, String number, String neighborhood, String city, String state,
			String complement) {
		super();
		this.cep = cep;
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.complement = complement;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\model\Category.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String name;
	private String description;
	private String departmentId;

	public Category() {
	}

	public Category(String id, String name, String description, String departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.departmentId = departmentId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\model\Department.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "departments")
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String name;
	private String description;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public Department() {
	}

	public Department(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {

		this.id = id;
		this.name = name;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Department other = (Department) obj;

		return Objects.equals(id, other.id);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\model\enums\MediaType.java

```java
package com.iagomoreira.urbanflow.model.enums;

public enum MediaType {
	IMAGE, VIDEO
}

```

# src\main\java\com\iagomoreira\urbanflow\model\enums\PriorityLevel.java

```java
package com.iagomoreira.urbanflow.model.enums;

public enum PriorityLevel {
	LOW, MEDIUM, HIGH, URGENT
}

```

# src\main\java\com\iagomoreira\urbanflow\model\enums\RequestStatus.java

```java
package com.iagomoreira.urbanflow.model.enums;

public enum RequestStatus {
	RECEIVED, UNDER_REVIEW, APPROVED, IN_PROGRESS, RESOLVED, REJECTED, CANCELLED
}

```

# src\main\java\com\iagomoreira\urbanflow\model\enums\Role.java

```java
package com.iagomoreira.urbanflow.model.enums;

public enum Role {
	CITIZEN, AGENCY, ADMIN, OPERATOR
}

```

# src\main\java\com\iagomoreira\urbanflow\model\Feedback.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Feedback implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Integer rating;
	private String comment;
	private LocalDateTime createdAt;
	private String userId;
	private String requestId;

	public Feedback() {
	}

	public Feedback(String id, Integer rating, String comment, LocalDateTime createdAt, String userId,
			String requestId) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
		this.createdAt = createdAt;
		this.userId = userId;
		this.requestId = requestId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feedback other = (Feedback) obj;
		return Objects.equals(id, other.id);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\model\Legislation.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Legislation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String title;
	private String description;
	private String documentUrl;

	private List<String> keywords = new ArrayList<>();

	public Legislation() {
	}

	public Legislation(String id, String title, String description, String documentUrl, List<String> keywords) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.documentUrl = documentUrl;
		this.keywords = keywords;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocumentUrl() {
		return documentUrl;
	}

	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Legislation other = (Legislation) obj;
		return Objects.equals(id, other.id);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\model\Media.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.iagomoreira.urbanflow.model.enums.MediaType;

public class Media implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private MediaType type;
	private String url;
	private LocalDateTime uploadedAt;
	private String requestId;

	public Media() {
	}

	public Media(String id, MediaType type, String url, LocalDateTime uploadedAt, String requestId) {
		super();
		this.id = id;
		this.type = type;
		this.url = url;
		this.uploadedAt = uploadedAt;
		this.requestId = requestId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MediaType getType() {
		return type;
	}

	public void setType(MediaType type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDateTime getUploadedAt() {
		return uploadedAt;
	}

	public void setUploadedAt(LocalDateTime uploadedAt) {
		this.uploadedAt = uploadedAt;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Media other = (Media) obj;
		return Objects.equals(id, other.id);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\model\Request.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Document(collection = "requests")
public class Request implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String userId;
	private String title;
	private String description;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private String categoryId;
	private String subCategoryId;
	private RequestStatus status;
	private PriorityLevel citizenPriority;
	private Double latitude;
	private Double longitude;
	private Address address;
	private String departmentId;

	private List<String> legislationIds = new ArrayList<>();

	public Request() {
	}

	public Request(String id, String userId, String title, String description, LocalDateTime createdAt,
			LocalDateTime updatedAt, String categoryId, String subCategoryId, RequestStatus status,
			PriorityLevel citizenPriority, Double latitude, Double longitude, Address address, String departmentId,
			List<String> legislationIds) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.categoryId = categoryId;
		this.subCategoryId = subCategoryId;
		this.status = status;
		this.citizenPriority = citizenPriority;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
		this.departmentId = departmentId;
		this.legislationIds = legislationIds;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public PriorityLevel getCitizenPriority() {
		return citizenPriority;
	}

	public void setCitizenPriority(PriorityLevel citizenPriority) {
		this.citizenPriority = citizenPriority;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public List<String> getLegislationIds() {
		return legislationIds;
	}

	public void setLegislationIds(List<String> legislationIds) {
		this.legislationIds = legislationIds;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		return Objects.equals(id, other.id);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\model\RequestHistory.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Document(collection = "request_history")
public class RequestHistory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String requestId;
	private RequestStatus oldStatus;
	private RequestStatus newStatus;
	private String changedBy;
	private String note;
	private LocalDateTime changedAt;

	public RequestHistory() {
	}

	public RequestHistory(String id, String requestId, RequestStatus oldStatus, RequestStatus newStatus,
			String changedBy, String note, LocalDateTime changedAt) {

		this.id = id;
		this.requestId = requestId;
		this.oldStatus = oldStatus;
		this.newStatus = newStatus;
		this.changedBy = changedBy;
		this.note = note;
		this.changedAt = changedAt;
	}

	public String getId() {
		return id;
	}

	public String getRequestId() {
		return requestId;
	}

	public RequestStatus getOldStatus() {
		return oldStatus;
	}

	public RequestStatus getNewStatus() {
		return newStatus;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public String getNote() {
		return note;
	}

	public LocalDateTime getChangedAt() {
		return changedAt;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public void setOldStatus(RequestStatus oldStatus) {
		this.oldStatus = oldStatus;
	}

	public void setNewStatus(RequestStatus newStatus) {
		this.newStatus = newStatus;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setChangedAt(LocalDateTime changedAt) {
		this.changedAt = changedAt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestHistory other = (RequestHistory) obj;
		return Objects.equals(id, other.id);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\model\SubCategory.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class SubCategory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String name;
	private String description;
	private String categoryId;
	private String departmentId;

	public SubCategory() {
	}

	public SubCategory(String id, String name, String description, String categoryId, String departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.categoryId = categoryId;
		this.departmentId = departmentId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubCategory other = (SubCategory) obj;
		return Objects.equals(id, other.id);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\model\Update.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class Update implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private RequestStatus status;
	private String description;
	private LocalDateTime updatedAt;
	private String requestId;

	public Update() {
	}

	public Update(String id, RequestStatus status, String description, LocalDateTime updatedAt, String requestId) {
		super();
		this.id = id;
		this.status = status;
		this.description = description;
		this.updatedAt = updatedAt;
		this.requestId = requestId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Update other = (Update) obj;
		return Objects.equals(id, other.id);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\model\User.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.iagomoreira.urbanflow.model.enums.Role;

@Document(collection = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String name;
	private String email;
	private String password;
	private String cpf;
	private Role role;
	private String departmentId;
	private Address address;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public User() {
	}

	public User(String id, String name, String email, String password, String cpf, Role role, String departmentId,
			Address address, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.cpf = cpf;
		this.address = address;
		this.role = role;
		this.departmentId = departmentId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\model\Vote.java

```java
package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

public class Vote implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private PriorityLevel priorityLevel;
	private LocalDateTime createdAt;
	private String userId;
	private String requestId;

	public Vote() {
	}

	public Vote(String id, PriorityLevel priorityLevel, LocalDateTime createdAt, String userId, String requestId) {
		super();
		this.id = id;
		this.priorityLevel = priorityLevel;
		this.createdAt = createdAt;
		this.userId = userId;
		this.requestId = requestId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(PriorityLevel priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vote other = (Vote) obj;
		return Objects.equals(id, other.id);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\repository\CategoryRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}

```

# src\main\java\com\iagomoreira\urbanflow\repository\DepartmentRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iagomoreira.urbanflow.model.Department;

public interface DepartmentRepository extends MongoRepository<Department, String> {

	Optional<Department> findByName(String name);

	boolean existsByName(String name);
}
```

# src\main\java\com\iagomoreira\urbanflow\repository\FeedbackRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Feedback;

@Repository
public interface FeedbackRepository extends MongoRepository<Feedback, String> {

	List<Feedback> findByRequestId(String requestId);

	boolean existsByUserIdAndRequestId(String userId, String requestId);
}

```

# src\main\java\com\iagomoreira\urbanflow\repository\LegislationRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Legislation;

@Repository
public interface LegislationRepository extends MongoRepository<Legislation, String> {

	@Query("{ 'keywords' : { $regex : ?0, $options : 'i' } }")
	List<Legislation> searchByKeyword(String keyword);
}

```

# src\main\java\com\iagomoreira\urbanflow\repository\MediaRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Media;

@Repository
public interface MediaRepository extends MongoRepository<Media, String> {

	List<Media> findByRequestId(String requestId);
}

```

# src\main\java\com\iagomoreira\urbanflow\repository\RequestHistoryRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iagomoreira.urbanflow.model.RequestHistory;

public interface RequestHistoryRepository extends MongoRepository<RequestHistory, String> {

	List<RequestHistory> findByRequestIdOrderByChangedAtAsc(String requestId);
}
```

# src\main\java\com\iagomoreira\urbanflow\repository\RequestRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Repository
public interface RequestRepository extends MongoRepository<Request, String> {

	List<Request> findByStatus(RequestStatus status);

	List<Request> findByCategoryId(String categoryId);

	List<Request> findBySubCategoryId(String subCategoryId);

	List<Request> findByUserId(String userId);
	
	List<Request> findByDepartmentId(String departmentId);
}

```

# src\main\java\com\iagomoreira\urbanflow\repository\SubCategoryRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.SubCategory;

@Repository
public interface SubCategoryRepository extends MongoRepository<SubCategory, String> {

	List<SubCategory> findByCategoryId(String categoryId);
}

```

# src\main\java\com\iagomoreira\urbanflow\repository\UpdateRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Update;

@Repository
public interface UpdateRepository extends MongoRepository<Update, String> {

	List<Update> findByRequestIdOrderByUpdatedAtAsc(String requestId);
}

```

# src\main\java\com\iagomoreira\urbanflow\repository\UserRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	Optional<User> findByEmail(String email);

	Optional<User> findByCpf(String cpf);

	boolean existsByEmail(String email);

	boolean existsByCpf(String cpf);

	List<User> findByRole(Role role);

	List<User> findByRoleAndDepartmentId(Role role, String departmentId);
}

```

# src\main\java\com\iagomoreira\urbanflow\repository\VoteRepository.java

```java
package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Vote;

@Repository
public interface VoteRepository extends MongoRepository<Vote, String> {

	boolean existsByUserIdAndRequestId(String userId, String requestId);

	List<Vote> findByRequestId(String requestId);
}

```

# src\main\java\com\iagomoreira\urbanflow\security\CustomUserDetailsService.java

```java
package com.iagomoreira.urbanflow.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private UserRepository userRepository;

	public CustomUserDetailsService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		User user = userRepository.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("User not found"));

		return new UserDetailsImplementation(user);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\security\JwtAuthenticationFilter.java

```java
package com.iagomoreira.urbanflow.security;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.iagomoreira.urbanflow.service.auth.TokenService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	private final TokenService tokenService;
	private final UserDetailsService userDetailsService;

	public JwtAuthenticationFilter(TokenService tokenService, UserDetailsService userDetailsService) {
		super();
		this.tokenService = tokenService;
		this.userDetailsService = userDetailsService;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			FilterChain filterChain) throws ServletException, IOException {

		String authHeader = httpServletRequest.getHeader("Authorization");

		if (authHeader == null || !authHeader.startsWith("Bearer ")) {

			filterChain.doFilter(httpServletRequest, httpServletResponse);
			return;
		}

		String token = authHeader.substring(7);

		String email = tokenService.extractUsername(token);

		if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {

			UserDetails userDetails = userDetailsService.loadUserByUsername(email);

			if (tokenService.isTokenValid(token)) {

				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());

				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));

				SecurityContextHolder.getContext().setAuthentication(authentication);
			}
		}

		filterChain.doFilter(httpServletRequest, httpServletResponse);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\security\UserDetailsImplementation.java

```java
package com.iagomoreira.urbanflow.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;

public class UserDetailsImplementation implements UserDetails {

	private static final long serialVersionUID = 1L;

	private String id;
	private String email;
	private String password;
	private String departmentId;
	private Role role;

	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImplementation(User user) {

		this.id = user.getId();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.departmentId = user.getDepartmentId();
		this.role = user.getRole();
		this.authorities = List.of(new SimpleGrantedAuthority("ROLE_" + user.getRole().name()));
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public String getId() {
		return id;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return email;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public Role getRole() {
		return role;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\auth\AuthenticationService.java

```java
package com.iagomoreira.urbanflow.service.auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class AuthenticationService {

	private final AuthenticationManager authenticationManager;
	private final UserRepository userRepository;
	private final TokenService tokenService;

	public AuthenticationService(AuthenticationManager authenticationManager, UserRepository userRepository,
			TokenService tokenService) {
		this.authenticationManager = authenticationManager;
		this.userRepository = userRepository;
		this.tokenService = tokenService;
	}

	public LoginResponseDTO login(LoginDTO dto) {

		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getEmail(), dto.getPassword()));
		User user = userRepository.findByEmail(dto.getEmail())
				.orElseThrow(() -> new ResourceNotFoundException("User not found"));

		String token = tokenService.generateToken(user.getEmail(), user.getRole().name());
		return new LoginResponseDTO(token);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\service\auth\AuthService.java

```java
package com.iagomoreira.urbanflow.service.auth;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;

@Service
public class AuthService {

	private final AuthenticationService authenticationService;
	private final CurrentUserService currentUserService;

	public AuthService(AuthenticationService authenticationService, CurrentUserService currentUserService) {
		super();
		this.authenticationService = authenticationService;
		this.currentUserService = currentUserService;
	}

	public LoginResponseDTO login(LoginDTO dto) {
		return authenticationService.login(dto);
	}

	public UserResponseDTO getCurrentUser() {
		return currentUserService.getCurrentUser();
	}

}
```

# src\main\java\com\iagomoreira\urbanflow\service\auth\CurrentUserService.java

```java
package com.iagomoreira.urbanflow.service.auth;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class CurrentUserService {

	private final UserRepository userRepository;
	private final UserMapper userMapper;

	public CurrentUserService(UserRepository userRepository, UserMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}

	public UserResponseDTO getCurrentUser() {

		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.findByEmail(email)
				.orElseThrow(() -> new ResourceNotFoundException("User not found"));

		return userMapper.toResponse(user);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\service\auth\TokenService.java

```java
package com.iagomoreira.urbanflow.service.auth;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class TokenService {

	@Value("${jwt.secret}")
	private String secret;

	@Value("${jwt.expiration}")
	private Long expiration;

	protected SecretKey getSigningKey() {
		return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
	}

	public String generateToken(String email, String role) {
		Date now = new Date();
		Date expirationDate = new Date(now.getTime() + expiration);
		return Jwts.builder().subject(email).claim("role", role).issuedAt(now).expiration(expirationDate)
				.signWith(getSigningKey()).compact();
	}

	public String extractUsername(String token) {
		return extractAllClaims(token).getSubject();
	}

	public boolean isTokenValid(String token) {
		try {
			return !extractAllClaims(token).getExpiration().before(new Date());
		} catch (ExpiredJwtException e) {
			return false;
		} catch (JwtException | IllegalArgumentException e) {
			return false;
		}
	}

	private Claims extractAllClaims(String token) {
		return Jwts.parser().verifyWith(getSigningKey()).build().parseSignedClaims(token).getPayload();
	}

	void setExpirationForTest(Long expiration) {
		this.expiration = expiration;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\category\CategoryCommandService.java

```java
package com.iagomoreira.urbanflow.service.category;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.mapper.CategoryMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@Service
public class CategoryCommandService {

	private final CategoryRepository categoryRepository;
	private final CategoryValidationService categoryValidationService;
	private final CategoryMapper categoryMapper;

	public CategoryCommandService(CategoryRepository categoryRepository,
			CategoryValidationService categoryValidationService, CategoryMapper categoryMapper) {
		this.categoryRepository = categoryRepository;
		this.categoryValidationService = categoryValidationService;
		this.categoryMapper = categoryMapper;
	}

	public CategoryResponseDTO create(CreateCategoryDTO dto) {
		categoryValidationService.validateDepartmentExists(dto.getDepartmentId());
		Category category = categoryMapper.toEntity(dto);

		category = categoryRepository.save(category);
		return categoryMapper.toResponse(category);
	}

	public CategoryResponseDTO update(String id, UpdateCategoryDTO dto) {
		Category category = categoryValidationService.validateCategoryExists(id);
		categoryValidationService.validateDepartmentExists(dto.getDepartmentId());

		categoryMapper.updateEntity(category, dto);

		category = categoryRepository.save(category);
		return categoryMapper.toResponse(category);
	}

	public void delete(String id) {
		categoryValidationService.validateCategoryExists(id);
		categoryRepository.deleteById(id);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\category\CategoryQueryService.java

```java
package com.iagomoreira.urbanflow.service.category;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.CategoryMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@Service
public class CategoryQueryService {

	private final CategoryRepository categoryRepository;
	private final CategoryValidationService categoryValidationService;
	private final CategoryMapper categoryMapper;

	public CategoryQueryService(CategoryRepository categoryRepository,
			CategoryValidationService categoryValidationService, CategoryMapper categoryMapper) {
		super();
		this.categoryRepository = categoryRepository;
		this.categoryValidationService = categoryValidationService;
		this.categoryMapper = categoryMapper;
	}

	public List<CategoryResponseDTO> findAll() {
		return categoryRepository.findAll().stream().map(categoryMapper::toResponse).toList();
	}

	public CategoryResponseDTO findById(String id) {

		Category category = categoryValidationService.validateCategoryExists(id);
		return categoryMapper.toResponse(category);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\category\CategoryService.java

```java
package com.iagomoreira.urbanflow.service.category;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;

@Service
public class CategoryService {

	private final CategoryCommandService categoryCommandService;
	private final CategoryQueryService categoryQueryService;

	public CategoryService(CategoryCommandService categoryCommandService, CategoryQueryService categoryQueryService) {
		super();
		this.categoryCommandService = categoryCommandService;
		this.categoryQueryService = categoryQueryService;
	}

	public CategoryResponseDTO create(CreateCategoryDTO dto) {
		return categoryCommandService.create(dto);
	}

	public List<CategoryResponseDTO> findAll() {
		return categoryQueryService.findAll();
	}

	public CategoryResponseDTO findById(String id) {
		return categoryQueryService.findById(id);
	}

	public void delete(String id) {
		categoryCommandService.delete(id);
	}

	public CategoryResponseDTO update(String id, UpdateCategoryDTO dto) {
		return categoryCommandService.update(id, dto);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\category\CategoryValidationService.java

```java
package com.iagomoreira.urbanflow.service.category;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class CategoryValidationService {

	private final CategoryRepository categoryRepository;
	private final DepartmentRepository departmentRepository;

	public CategoryValidationService(CategoryRepository categoryRepository, DepartmentRepository departmentRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.departmentRepository = departmentRepository;
	}

	public Category validateCategoryExists(String id) {
		return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found"));
	}

	public void validateDepartmentExists(String departmentId) {
		if (!departmentRepository.existsById(departmentId)) {
			throw new ResourceNotFoundException("Department not found");
		}
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\common\DateTimeProvider.java

```java
package com.iagomoreira.urbanflow.service.common;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class DateTimeProvider {

	public LocalDateTime now() {
		return LocalDateTime.now();
	}

	public LocalDateTime utcNow() {
		return LocalDateTime.now(java.time.Clock.systemUTC());
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\dashboard\DashboardMetricsService.java

```java
package com.iagomoreira.urbanflow.service.dashboard;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@Service
public class DashboardMetricsService {

	private final RequestRepository requestRepository;
	private final UserRepository userRepository;
	private final VoteRepository voteRepository;
	private final FeedbackRepository feedbackRepository;

	public DashboardMetricsService(RequestRepository requestRepository, UserRepository userRepository,
			VoteRepository voteRepository, FeedbackRepository feedbackRepository) {
		super();
		this.requestRepository = requestRepository;
		this.userRepository = userRepository;
		this.voteRepository = voteRepository;
		this.feedbackRepository = feedbackRepository;
	}

	public List<Request> getRequests() {
		return requestRepository.findAll();
	}

	public long countRequests() {
		return requestRepository.count();
	}

	public long countByStatus(RequestStatus status) {
		return requestRepository.findByStatus(status).size();
	}

	public long countUsers() {
		return userRepository.count();
	}

	public long countVotes() {
		return voteRepository.count();
	}

	public long countFeedbacks() {
		return feedbackRepository.count();
	}

	public List<Feedback> getFeedbacks() {
		return feedbackRepository.findAll();
	}

	public double getAverageRating() {
		return feedbackRepository.findAll().stream().mapToInt(Feedback::getRating).average().orElse(0.0);
	}

	public double getResolutionRate() {

		long total = countRequests();

		if (total == 0) {
			return 0.0;
		}

		return (countByStatus(RequestStatus.RESOLVED) * 100.0) / total;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\dashboard\DashboardQueryService.java

```java
package com.iagomoreira.urbanflow.service.dashboard;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.mapper.DashboardMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class DashboardQueryService {

	private final RequestRepository requestRepository;
	private final CategoryRepository categoryRepository;
	private final SubCategoryRepository subCategoryRepository;
	private final DashboardMapper dashboardMapper;

	public DashboardQueryService(RequestRepository requestRepository, CategoryRepository categoryRepository,
			SubCategoryRepository subCategoryRepository, DashboardMapper dashboardMapper) {
		super();
		this.requestRepository = requestRepository;
		this.categoryRepository = categoryRepository;
		this.subCategoryRepository = subCategoryRepository;
		this.dashboardMapper = dashboardMapper;
	}

	public List<TopCategoryDTO> getTopCategories() {
		return requestRepository.findAll().stream()
				.collect(Collectors.groupingBy(Request::getCategoryId, Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(5).map(entry -> {
					Category category = categoryRepository.findById(entry.getKey()).orElse(null);
					String categoryName = category != null ? category.getName() : "Unknown";
					return dashboardMapper.toTopCategoryResponse(entry.getKey(), categoryName,
							entry.getValue().intValue());
				}).toList();
	}

	public List<TopSubCategoryDTO> getTopSubCategories() {
		return requestRepository.findAll().stream()
				.collect(Collectors.groupingBy(Request::getSubCategoryId, Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(5).map(entry -> {
					SubCategory subCategory = subCategoryRepository.findById(entry.getKey()).orElse(null);
					String subCategoryName = subCategory != null ? subCategory.getName() : "Unknown";
					return dashboardMapper.toTopSubCategoryResponse(entry.getKey(), subCategoryName,
							entry.getValue().intValue());
				}).toList();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\dashboard\DashboardService.java

```java
package com.iagomoreira.urbanflow.service.dashboard;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;

@Service
public class DashboardService {

	private final DashboardQueryService dashboardQueryService;
	private final DashboardStatisticsService dashboardStatisticsService;

	public DashboardService(DashboardQueryService dashboardQueryService,
			DashboardStatisticsService dashboardStatisticsService) {
		super();
		this.dashboardQueryService = dashboardQueryService;
		this.dashboardStatisticsService = dashboardStatisticsService;
	}

	public DashboardStatisticsDTO getStatistics() {
		return dashboardStatisticsService.getStatistics();
	}

	public DashboardOverviewDTO getOverview() {
		return dashboardStatisticsService.getOverview();
	}

	public List<TopCategoryDTO> getTopCategories() {
		return dashboardQueryService.getTopCategories();
	}

	public List<TopSubCategoryDTO> getTopSubCategories() {
		return dashboardQueryService.getTopSubCategories();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\dashboard\DashboardStatisticsService.java

```java
package com.iagomoreira.urbanflow.service.dashboard;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.mapper.DashboardMapper;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Service
public class DashboardStatisticsService {

	private final DashboardMetricsService dashboardMetricsService;
	private final DashboardMapper dashboardMapper;

	public DashboardStatisticsService(DashboardMetricsService dashboardMetricsService,
			DashboardMapper dashboardMapper) {
		super();
		this.dashboardMetricsService = dashboardMetricsService;
		this.dashboardMapper = dashboardMapper;
	}

	public DashboardStatisticsDTO getStatistics() {

		return dashboardMapper.toStatisticsResponse(

				(int) dashboardMetricsService.countRequests(),
				(int) dashboardMetricsService.countByStatus(RequestStatus.RECEIVED),
				(int) dashboardMetricsService.countByStatus(RequestStatus.IN_PROGRESS),
				(int) dashboardMetricsService.countByStatus(RequestStatus.RESOLVED),
				(int) dashboardMetricsService.countByStatus(RequestStatus.CANCELLED),

				dashboardMetricsService.getResolutionRate(), (int) dashboardMetricsService.countUsers(),
				(int) dashboardMetricsService.countVotes(), (int) dashboardMetricsService.countFeedbacks(),

				dashboardMetricsService.getAverageRating());
	}

	public DashboardOverviewDTO getOverview() {

		return dashboardMapper.toOverviewResponse(

				dashboardMetricsService.countRequests(), dashboardMetricsService.countByStatus(RequestStatus.RECEIVED),
				dashboardMetricsService.countByStatus(RequestStatus.UNDER_REVIEW),
				dashboardMetricsService.countByStatus(RequestStatus.APPROVED),
				dashboardMetricsService.countByStatus(RequestStatus.IN_PROGRESS),
				dashboardMetricsService.countByStatus(RequestStatus.RESOLVED),
				dashboardMetricsService.countByStatus(RequestStatus.CANCELLED),
				dashboardMetricsService.countByStatus(RequestStatus.REJECTED),

				dashboardMetricsService.countUsers(), dashboardMetricsService.countVotes(),
				dashboardMetricsService.getAverageRating());
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\department\DepartmentCommandService.java

```java
package com.iagomoreira.urbanflow.service.department;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.mapper.DepartmentMapper;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@Service
public class DepartmentCommandService {

	private final DepartmentRepository departmentRepository;
	private final DepartmentValidationService departmentValidationService;
	private final DepartmentMapper departmentMapper;
	private final DateTimeProvider dateTimeProvider;

	public DepartmentCommandService(DepartmentRepository departmentRepository,
			DepartmentValidationService departmentValidationService, DepartmentMapper departmentMapper,
			DateTimeProvider dateTimeProvider) {
		this.departmentRepository = departmentRepository;
		this.departmentValidationService = departmentValidationService;
		this.departmentMapper = departmentMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public DepartmentResponseDTO create(CreateDepartmentDTO dto) {
		departmentValidationService.validateDepartmentNameAlreadyExists(dto.getName());
		Department department = departmentMapper.toEntity(dto);

		department.setCreatedAt(dateTimeProvider.now());

		department = departmentRepository.save(department);
		return departmentMapper.toResponse(department);
	}

	public DepartmentResponseDTO update(String id, UpdateDepartmentDTO dto) {
		Department department = departmentValidationService.validateDepartmentExists(id);
		departmentValidationService.validateDepartmentNameForUpdate(department, dto.getName());

		departmentMapper.updateEntity(department, dto);
		department.setUpdatedAt(dateTimeProvider.now());

		department = departmentRepository.save(department);
		return departmentMapper.toResponse(department);
	}

	public void delete(String id) {
		departmentValidationService.validateDepartmentExists(id);
		departmentRepository.deleteById(id);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\department\DepartmentQueryService.java

```java
package com.iagomoreira.urbanflow.service.department;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.mapper.DepartmentMapper;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class DepartmentQueryService {

	private final DepartmentRepository departmentRepository;
	private final DepartmentValidationService departmentValidationService;
	private final DepartmentMapper departmentMapper;

	public DepartmentQueryService(DepartmentRepository departmentRepository,
			DepartmentValidationService departmentValidationService, DepartmentMapper departmentMapper) {
		this.departmentRepository = departmentRepository;
		this.departmentValidationService = departmentValidationService;
		this.departmentMapper = departmentMapper;
	}

	public List<DepartmentResponseDTO> findAll() {
		return departmentRepository.findAll().stream().map(departmentMapper::toResponse).toList();
	}

	public DepartmentResponseDTO findById(String id) {
		Department department = departmentValidationService.validateDepartmentExists(id);
		return departmentMapper.toResponse(department);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\department\DepartmentService.java

```java
package com.iagomoreira.urbanflow.service.department;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;

@Service
public class DepartmentService {

	private final DepartmentCommandService departmentCommandService;
	private final DepartmentQueryService departmentQueryService;

	public DepartmentService(DepartmentCommandService departmentCommandService,
			DepartmentQueryService departmentQueryService) {
		super();
		this.departmentCommandService = departmentCommandService;
		this.departmentQueryService = departmentQueryService;
	}

	public DepartmentResponseDTO create(CreateDepartmentDTO dto) {
		return departmentCommandService.create(dto);
	}

	public List<DepartmentResponseDTO> findAll() {
		return departmentQueryService.findAll();
	}

	public DepartmentResponseDTO findById(String id) {
		return departmentQueryService.findById(id);
	}

	public DepartmentResponseDTO update(String id, UpdateDepartmentDTO dto) {
		return departmentCommandService.update(id, dto);
	}

	public void delete(String id) {
		departmentCommandService.delete(id);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\department\DepartmentValidationService.java

```java
package com.iagomoreira.urbanflow.service.department;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class DepartmentValidationService {

	private final DepartmentRepository departmentRepository;

	public DepartmentValidationService(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	public Department validateDepartmentExists(String id) {
		return departmentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Department not found"));
	}

	public void validateDepartmentNameAlreadyExists(String name) {
		if (departmentRepository.existsByName(name)) {
			throw new BusinessException("Department already exists");
		}
	}

	public void validateDepartmentNameForUpdate(Department department, String newName) {
		if (!department.getName().equals(newName) && departmentRepository.existsByName(newName)) {
			throw new BusinessException("Department already exists");
		}
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\feedback\FeedbackCommandService.java

```java
package com.iagomoreira.urbanflow.service.feedback;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@Service
public class FeedbackCommandService {

	private final FeedbackRepository feedbackRepository;
	private final FeedbackValidationService feedbackValidationService;
	private final FeedbackMapper feedbackMapper;
	private final DateTimeProvider dateTimeProvider;
	private final SecurityService securityService;

	public FeedbackCommandService(FeedbackRepository feedbackRepository,
			FeedbackValidationService feedbackValidationService, FeedbackMapper feedbackMapper,
			DateTimeProvider dateTimeProvider, SecurityService securityService) {
		this.feedbackRepository = feedbackRepository;
		this.feedbackValidationService = feedbackValidationService;
		this.feedbackMapper = feedbackMapper;
		this.dateTimeProvider = dateTimeProvider;
		this.securityService = securityService;
	}

	public FeedbackResponseDTO create(CreateFeedbackDTO dto) {

		String userId = securityService.getAuthenticatedUserId();
		feedbackValidationService.validateUserExists(userId);

		Request request = feedbackValidationService.validateRequestExists(dto.getRequestId());

		feedbackValidationService.validateResolvedRequest(request);
		feedbackValidationService.validateDuplicateFeedback(userId, dto.getRequestId());

		Feedback feedback = feedbackMapper.toEntity(dto);

		feedback.setUserId(userId);
		feedback.setCreatedAt(dateTimeProvider.now());

		feedback = feedbackRepository.save(feedback);
		return feedbackMapper.toResponse(feedback);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\feedback\FeedbackQueryService.java

```java
package com.iagomoreira.urbanflow.service.feedback;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@Service
public class FeedbackQueryService {

	private final FeedbackRepository feedbackRepository;
	private final FeedbackValidationService feedbackValidationService;
	private final FeedbackMapper feedbackMapper;

	public FeedbackQueryService(FeedbackRepository feedbackRepository,
			FeedbackValidationService feedbackValidationService, FeedbackMapper feedbackMapper) {
		this.feedbackRepository = feedbackRepository;
		this.feedbackValidationService = feedbackValidationService;
		this.feedbackMapper = feedbackMapper;
	}

	public List<FeedbackResponseDTO> findAll() {
		return feedbackRepository.findAll().stream().map(feedbackMapper::toResponse).toList();
	}

	public List<FeedbackResponseDTO> findByRequest(String requestId) {
		feedbackValidationService.validateRequestExists(requestId);
		return feedbackRepository.findByRequestId(requestId).stream().map(feedbackMapper::toResponse).toList();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\feedback\FeedbackService.java

```java
package com.iagomoreira.urbanflow.service.feedback;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;

@Service
public class FeedbackService {

	private final FeedbackCommandService feedbackCommandService;
	private final FeedbackQueryService feedbackQueryService;
	private final FeedbackStatisticsService feedbackStatisticsService;

	public FeedbackService(FeedbackCommandService feedbackCommandService, FeedbackQueryService feedbackQueryService,
			FeedbackStatisticsService feedbackStatisticsService) {
		super();
		this.feedbackCommandService = feedbackCommandService;
		this.feedbackQueryService = feedbackQueryService;
		this.feedbackStatisticsService = feedbackStatisticsService;
	}

	public FeedbackResponseDTO create(CreateFeedbackDTO dto) {
		return feedbackCommandService.create(dto);
	}

	public List<FeedbackResponseDTO> findAll() {
		return feedbackQueryService.findAll();
	}

	public List<FeedbackResponseDTO> findByRequest(String requestId) {
		return feedbackQueryService.findByRequest(requestId);
	}

	public FeedbackStatisticsDTO getStatistics(String requestId) {
		return feedbackStatisticsService.getStatistics(requestId);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\service\feedback\FeedbackStatisticsService.java

```java
package com.iagomoreira.urbanflow.service.feedback;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@Service
public class FeedbackStatisticsService {

	private final FeedbackRepository feedbackRepository;
	private final FeedbackValidationService feedbackValidationService;
	private final FeedbackMapper feedbackMapper;

	public FeedbackStatisticsService(FeedbackRepository feedbackRepository,
			FeedbackValidationService feedbackValidationService, FeedbackMapper feedbackMapper) {
		super();
		this.feedbackRepository = feedbackRepository;
		this.feedbackValidationService = feedbackValidationService;
		this.feedbackMapper = feedbackMapper;
	}

	public FeedbackStatisticsDTO getStatistics(String requestId) {

		feedbackValidationService.validateRequestExists(requestId);

		List<Feedback> feedbacks = feedbackRepository.findByRequestId(requestId);
		int totalFeedbacks = feedbacks.size();

		if (totalFeedbacks == 0) {
			return feedbackMapper.toStatisticsResponse(0.0, 0, 0, 0, 0, 0, 0, 0.0);
		}

		int fiveStars = (int) feedbacks.stream().filter(f -> f.getRating() == 5).count();
		int fourStars = (int) feedbacks.stream().filter(f -> f.getRating() == 4).count();
		int threeStars = (int) feedbacks.stream().filter(f -> f.getRating() == 3).count();
		int twoStars = (int) feedbacks.stream().filter(f -> f.getRating() == 2).count();
		int oneStar = (int) feedbacks.stream().filter(f -> f.getRating() == 1).count();

		double averageRating = feedbacks.stream().mapToInt(Feedback::getRating).average().orElse(0.0);
		long satisfiedCount = feedbacks.stream().filter(f -> f.getRating() >= 4).count();
		double satisfactionPercentage = (satisfiedCount * 100.0) / totalFeedbacks;

		return feedbackMapper.toStatisticsResponse(averageRating, totalFeedbacks, fiveStars, fourStars, threeStars,
				twoStars, oneStar, satisfactionPercentage);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\feedback\FeedbackValidationService.java

```java
package com.iagomoreira.urbanflow.service.feedback;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class FeedbackValidationService {

	private final UserRepository userRepository;
	private final RequestRepository requestRepository;
	private final FeedbackRepository feedbackRepository;

	public FeedbackValidationService(UserRepository userRepository, RequestRepository requestRepository,
			FeedbackRepository feedbackRepository) {
		super();
		this.userRepository = userRepository;
		this.requestRepository = requestRepository;
		this.feedbackRepository = feedbackRepository;
	}

	public void validateUserExists(String userId) {
		if (!userRepository.existsById(userId)) {
			throw new ResourceNotFoundException("User not found");
		}
	}

	public Request validateRequestExists(String requestId) {
		return requestRepository.findById(requestId)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));
	}

	public void validateResolvedRequest(Request request) {
		if (request.getStatus() != RequestStatus.RESOLVED) {
			throw new BusinessException("Feedback can only be submitted for resolved requests");
		}
	}

	public void validateDuplicateFeedback(String userId, String requestId) {
		if (feedbackRepository.existsByUserIdAndRequestId(userId, requestId)) {
			throw new BusinessException("User has already submitted feedback for this request");
		}
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\legislation\LegislationQueryService.java

```java
package com.iagomoreira.urbanflow.service.legislation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.mapper.LegislationMapper;
import com.iagomoreira.urbanflow.model.Legislation;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@Service
public class LegislationQueryService {

	private final LegislationRepository legislationRepository;
	private final LegislationValidationService legislationValidationService;
	private final LegislationMapper legislationMapper;

	public LegislationQueryService(LegislationRepository legislationRepository,
			LegislationValidationService legislationValidationService, LegislationMapper legislationMapper) {
		this.legislationRepository = legislationRepository;
		this.legislationValidationService = legislationValidationService;
		this.legislationMapper = legislationMapper;
	}

	public List<LegislationResponseDTO> findAll() {
		return legislationRepository.findAll().stream().map(legislationMapper::toResponse).toList();
	}

	public LegislationResponseDTO findById(String id) {
		Legislation legislation = legislationValidationService.validateLegislationExists(id);
		return legislationMapper.toResponse(legislation);
	}

	public List<LegislationResponseDTO> findByKeyword(String keyword) {
		return legislationRepository.searchByKeyword(keyword).stream().map(legislationMapper::toResponse).toList();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\legislation\LegislationService.java

```java
package com.iagomoreira.urbanflow.service.legislation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;

@Service
public class LegislationService {

	private final LegislationQueryService legislationQueryService;

	public LegislationService(LegislationQueryService legislationQueryService) {
		super();
		this.legislationQueryService = legislationQueryService;
	}

	public List<LegislationResponseDTO> findAll() {
		return legislationQueryService.findAll();
	}

	public LegislationResponseDTO findById(String id) {
		return legislationQueryService.findById(id);
	}

	public List<LegislationResponseDTO> findByKeyword(String keyword) {
		return legislationQueryService.findByKeyword(keyword);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\service\legislation\LegislationValidationService.java

```java
package com.iagomoreira.urbanflow.service.legislation;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Legislation;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@Service
public class LegislationValidationService {

	private final LegislationRepository legislationRepository;

	public LegislationValidationService(LegislationRepository legislationRepository) {
		super();
		this.legislationRepository = legislationRepository;
	}

	public Legislation validateLegislationExists(String id) {
		return legislationRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Legislation not found"));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\media\MediaCommandService.java

```java
package com.iagomoreira.urbanflow.service.media;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.mapper.MediaMapper;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@Service
public class MediaCommandService {

	private final MediaRepository mediaRepository;
	private final MediaValidationService mediaValidationService;
	private final MediaMapper mediaMapper;
	private final DateTimeProvider dateTimeProvider;

	public MediaCommandService(MediaRepository mediaRepository, MediaValidationService mediaValidationService,
			MediaMapper mediaMapper, DateTimeProvider dateTimeProvider) {
		this.mediaRepository = mediaRepository;
		this.mediaValidationService = mediaValidationService;
		this.mediaMapper = mediaMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public MediaResponseDTO create(CreateMediaDTO dto) {
		mediaValidationService.validateRequest(dto.getRequestId());
		Media media = mediaMapper.toEntity(dto);

		media.setUploadedAt(dateTimeProvider.now());

		media = mediaRepository.save(media);
		return mediaMapper.toResponse(media);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\media\MediaQueryService.java

```java
package com.iagomoreira.urbanflow.service.media;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.mapper.MediaMapper;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;

@Service
public class MediaQueryService {

	private final MediaRepository mediaRepository;
	private final MediaValidationService mediaValidationService;
	private final MediaMapper mediaMapper;

	public MediaQueryService(MediaRepository mediaRepository, MediaValidationService mediaValidationService,
			MediaMapper mediaMapper) {
		this.mediaRepository = mediaRepository;
		this.mediaValidationService = mediaValidationService;
		this.mediaMapper = mediaMapper;
	}

	public List<MediaResponseDTO> findAll() {
		return mediaRepository.findAll().stream().map(mediaMapper::toResponse).toList();
	}

	public List<MediaResponseDTO> findByRequest(String requestId) {
		mediaValidationService.validateRequest(requestId);
		return mediaRepository.findByRequestId(requestId).stream().map(mediaMapper::toResponse).toList();
	}

	public MediaResponseDTO findById(String id) {
		Media media = mediaValidationService.validateMediaExists(id);
		return mediaMapper.toResponse(media);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\media\MediaService.java

```java
package com.iagomoreira.urbanflow.service.media;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;

@Service
public class MediaService {

	private final MediaCommandService mediaCommandService;
	private final MediaQueryService mediaQueryService;

	public MediaService(MediaCommandService mediaCommandService, MediaQueryService mediaQueryService) {
		super();
		this.mediaCommandService = mediaCommandService;
		this.mediaQueryService = mediaQueryService;
	}

	public MediaResponseDTO create(CreateMediaDTO dto) {
		return mediaCommandService.create(dto);
	}

	public List<MediaResponseDTO> findAll() {
		return mediaQueryService.findAll();
	}

	public List<MediaResponseDTO> findByRequest(String requestId) {
		return mediaQueryService.findByRequest(requestId);
	}

	public MediaResponseDTO findById(String id) {
		return mediaQueryService.findById(id);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\service\media\MediaStorageService.java

```java
package com.iagomoreira.urbanflow.service.media;

public class MediaStorageService {

}

```

# src\main\java\com\iagomoreira\urbanflow\service\media\MediaValidationService.java

```java
package com.iagomoreira.urbanflow.service.media;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@Service
public class MediaValidationService {

	private final MediaRepository mediaRepository;
	private final RequestRepository requestRepository;

	public MediaValidationService(MediaRepository mediaRepository, RequestRepository requestRepository) {
		super();
		this.mediaRepository = mediaRepository;
		this.requestRepository = requestRepository;
	}

	public void validateRequest(String requestId) {
		if (!requestRepository.existsById(requestId)) {
			throw new ResourceNotFoundException("Request not found");
		}
	}

	public Media validateMediaExists(String id) {
		return mediaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Media not found"));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\request\RequestCommandService.java

```java
package com.iagomoreira.urbanflow.service.request;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@Service
public class RequestCommandService {

	private final RequestRepository requestRepository;
	private final RequestValidationService requestValidationService;
	private final SecurityService securityService;
	private final RequestMapper requestMapper;
	private final DateTimeProvider dateTimeProvider;

	public RequestCommandService(RequestRepository requestRepository, UserRepository userRepository,
			RequestValidationService requestValidationService, SecurityService securityService,
			SubCategoryRepository subCategoryRepository, RequestMapper requestMapper,
			DateTimeProvider dateTimeProvider) {
		this.requestRepository = requestRepository;
		this.requestValidationService = requestValidationService;
		this.securityService = securityService;
		this.requestMapper = requestMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public RequestResponseDTO create(CreateRequestDTO dto) {
		String authenticatedUserId = securityService.getAuthenticatedUserId();
		requestValidationService.validateAuthenticatedUser(authenticatedUserId);

		SubCategory subCategory = requestValidationService.validateSubCategory(dto);
		Request request = requestMapper.toEntity(dto);

		request.setUserId(authenticatedUserId);
		request.setDepartmentId(subCategory.getDepartmentId());
		request.setStatus(RequestStatus.RECEIVED);
		request.setCreatedAt(dateTimeProvider.now());
		request.setUpdatedAt(dateTimeProvider.now());

		request = requestRepository.save(request);
		return requestMapper.toResponse(request);
	}

	public RequestResponseDTO update(String id, UpdateRequestDTO dto) {
		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		requestValidationService.validateRequestAccess(request);
		requestValidationService.validateRequestEditable(request);
		requestMapper.updateEntity(request, dto);
		request.setUpdatedAt(dateTimeProvider.now());

		request = requestRepository.save(request);
		return requestMapper.toResponse(request);
	}

	public void delete(String id) {
		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		requestValidationService.validateRequestAccess(request);
		requestValidationService.validateRequestDeletion(request);
		requestRepository.deleteById(id);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\request\RequestQueryService.java

```java
package com.iagomoreira.urbanflow.service.request;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@Service
public class RequestQueryService {

	private final MongoTemplate mongoTemplate;
	private final RequestRepository requestRepository;
	private final UserRepository userRepository;
	private final CategoryRepository categoryRepository;
	private final DepartmentRepository departmentRepository;
	private final SubCategoryRepository subCategoryRepository;
	private final SecurityService securityService;
	private final RequestValidationService requestValidationService;
	private final RequestMapper requestMapper;

	public RequestQueryService(MongoTemplate mongoTemplate, RequestRepository requestRepository,
			UserRepository userRepository, CategoryRepository categoryRepository,
			DepartmentRepository departmentRepository, SubCategoryRepository subCategoryRepository,
			SecurityService securityService, RequestValidationService requestValidationService,
			RequestMapper requestMapper) {
		this.mongoTemplate = mongoTemplate;
		this.requestRepository = requestRepository;
		this.userRepository = userRepository;
		this.categoryRepository = categoryRepository;
		this.departmentRepository = departmentRepository;
		this.subCategoryRepository = subCategoryRepository;
		this.securityService = securityService;
		this.requestValidationService = requestValidationService;
		this.requestMapper = requestMapper;
	}

	public List<RequestResponseDTO> findAll() {
		List<Request> requests;

		if (securityService.isAdmin()) {
			requests = requestRepository.findAll();
		} else if (securityService.isOperator()) {
			requests = requestRepository.findByDepartmentId(securityService.getAuthenticatedDepartmentId());
		} else {
			requests = requestRepository.findByUserId(securityService.getAuthenticatedUserId());
		}

		return requests.stream().map(requestMapper::toResponse).toList();
	}

	public RequestResponseDTO findById(String id) {
		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		requestValidationService.validateRequestAccess(request);
		return requestMapper.toResponse(request);
	}

	public List<RequestResponseDTO> findByStatus(RequestStatus status) {
		return requestRepository.findByStatus(status).stream().map(requestMapper::toResponse).toList();
	}

	public List<RequestResponseDTO> findByCategory(String categoryId) {
		if (!categoryRepository.existsById(categoryId)) {
			throw new ResourceNotFoundException("Category not found");
		}

		return requestRepository.findByCategoryId(categoryId).stream().map(requestMapper::toResponse).toList();
	}

	public List<RequestResponseDTO> findBySubCategory(String subCategoryId) {
		if (!subCategoryRepository.existsById(subCategoryId)) {
			throw new ResourceNotFoundException("SubCategory not found");
		}

		return requestRepository.findBySubCategoryId(subCategoryId).stream().map(requestMapper::toResponse).toList();
	}

	public List<RequestResponseDTO> findByUser(String userId) {
		if (!userRepository.existsById(userId)) {
			throw new ResourceNotFoundException("User not found");
		}
		if (securityService.isCitizen() && !securityService.getAuthenticatedUserId().equals(userId)) {
			throw new BusinessException("Access denied");
		}

		return requestRepository.findByUserId(userId).stream().map(requestMapper::toResponse).toList();
	}

	public List<RequestResponseDTO> findByDepartment(String departmentId) {
		if (!departmentRepository.existsById(departmentId)) {
			throw new ResourceNotFoundException("Department not found");
		}
		if (securityService.isCitizen()) {
			throw new BusinessException("Access denied");
		}
		if (securityService.isOperator() && !securityService.getAuthenticatedDepartmentId().equals(departmentId)) {
			throw new BusinessException("Access denied");
		}

		return requestRepository.findByDepartmentId(departmentId).stream().map(requestMapper::toResponse).toList();
	}

	public Page<RequestResponseDTO> search(RequestStatus status, String categoryId, String subCategoryId,
			String departmentId, String userId, int page, int size, String sortBy, String direction) {

		String validatedSortField = validateSortField(sortBy);

		if (securityService.isOperator()) {
			departmentId = securityService.getAuthenticatedDepartmentId();
			userId = null;
		}
		if (securityService.isCitizen()) {
			userId = securityService.getAuthenticatedUserId();
			departmentId = null;
		}

		Criteria criteria = buildCriteria(status, categoryId, subCategoryId, departmentId, userId);
		Query query = new Query(criteria);

		Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(validatedSortField).descending()
				: Sort.by(validatedSortField).ascending();
		query.with(sort);

		long total = mongoTemplate.count(query, Request.class);

		Pageable pageable = PageRequest.of(page, size, sort);
		query.with(pageable);

		List<Request> requests = mongoTemplate.find(query, Request.class);
		List<RequestResponseDTO> content = requests.stream().map(requestMapper::toResponse).toList();

		return new PageImpl<>(content, pageable, total);
	}

	public List<RequestResponseDTO> search(RequestStatus status, String categoryId, String subCategoryId,
			String departmentId, String userId) {

		if (securityService.isOperator()) {
			departmentId = securityService.getAuthenticatedDepartmentId();
			userId = null;
		}
		if (securityService.isCitizen()) {
			userId = securityService.getAuthenticatedUserId();
			departmentId = null;
		}

		Criteria criteria = buildCriteria(status, categoryId, subCategoryId, departmentId, userId);
		Query query = new Query(criteria);
		List<Request> requests = mongoTemplate.find(query, Request.class);
		return requests.stream().map(requestMapper::toResponse).toList();
	}

	private Criteria buildCriteria(RequestStatus status, String categoryId, String subCategoryId, String departmentId,
			String userId) {
		Criteria criteria = new Criteria();
		if (status != null) {
			criteria = criteria.and("status").is(status);
		}
		if (categoryId != null && !categoryId.isBlank()) {
			criteria = criteria.and("categoryId").is(categoryId);
		}
		if (subCategoryId != null && !subCategoryId.isBlank()) {
			criteria = criteria.and("subCategoryId").is(subCategoryId);
		}
		if (userId != null && !userId.isBlank()) {
			criteria = criteria.and("userId").is(userId);
		}
		if (departmentId != null && !departmentId.isBlank()) {
			criteria = criteria.and("departmentId").is(departmentId);
		}
		return criteria;
	}

	private String validateSortField(String sortBy) {
		Set<String> allowedFields = Set.of("createdAt", "updatedAt", "title", "status", "citizenPriority",
				"departmentId");
		return allowedFields.contains(sortBy) ? sortBy : "createdAt";
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\request\RequestService.java

```java
package com.iagomoreira.urbanflow.service.request;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestStatusDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Service
public class RequestService {

	private final RequestCommandService requestCommandService;
	private final RequestQueryService requestQueryService;
	private final RequestWorkflowService requestWorkflowService;
	private final RequestStatisticsService requestStatisticsService;

	public RequestService(RequestCommandService requestCommandService, RequestQueryService requestQueryService,
			RequestWorkflowService requestWorkflowService, RequestStatisticsService requestStatisticsService) {
		super();
		this.requestCommandService = requestCommandService;
		this.requestQueryService = requestQueryService;
		this.requestWorkflowService = requestWorkflowService;
		this.requestStatisticsService = requestStatisticsService;
	}

	public RequestResponseDTO create(CreateRequestDTO dto) {
		return requestCommandService.create(dto);
	}

	public RequestResponseDTO update(String id, UpdateRequestDTO dto) {
		return requestCommandService.update(id, dto);
	}

	public void delete(String id) {
		requestCommandService.delete(id);
	}

	public RequestResponseDTO updateStatus(String id, UpdateRequestStatusDTO dto) {
		return requestWorkflowService.updateStatus(id, dto);
	}

	public List<RequestResponseDTO> findAll() {
		return requestQueryService.findAll();
	}

	public RequestResponseDTO findById(String id) {
		return requestQueryService.findById(id);
	}

	public List<RequestResponseDTO> findByStatus(RequestStatus status) {
		return requestQueryService.findByStatus(status);
	}

	public List<RequestResponseDTO> findByCategory(String categoryId) {
		return requestQueryService.findByCategory(categoryId);
	}

	public List<RequestResponseDTO> findBySubCategory(String subCategoryId) {
		return requestQueryService.findBySubCategory(subCategoryId);
	}

	public List<RequestResponseDTO> findByUser(String userId) {
		return requestQueryService.findByUser(userId);
	}

	public List<RequestResponseDTO> findByDepartment(String departmentId) {
		return requestQueryService.findByDepartment(departmentId);
	}

	public Page<RequestResponseDTO> search(RequestStatus status, String categoryId, String subCategoryId,
			String departmentId, String userId, int page, int size, String sortBy, String direction) {
		return requestQueryService.search(status, categoryId, subCategoryId, departmentId, userId, page, size, sortBy,
				direction);
	}

	public List<RequestResponseDTO> search(RequestStatus status, String categoryId, String subCategoryId,
			String departmentId, String userId) {
		return requestQueryService.search(status, categoryId, subCategoryId, departmentId, userId);
	}

	public RequestStatisticsDTO getStatistics() {
		return requestStatisticsService.getStatistics();
	}

	public CategoryStatisticsDTO getCategoryStatistics(String categoryId) {
		return requestStatisticsService.getCategoryStatistics(categoryId);
	}

	public SubCategoryStatisticsDTO getSubCategoryStatistics(String subCategoryId) {
		return requestStatisticsService.getSubCategoryStatistics(subCategoryId);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\service\request\RequestStatisticsService.java

```java
package com.iagomoreira.urbanflow.service.request;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.CategoryMapper;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.mapper.SubCategoryMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class RequestStatisticsService {

	private final RequestRepository requestRepository;
	private final CategoryRepository categoryRepository;
	private final SubCategoryRepository subCategoryRepository;
	private final RequestMapper requestMapper;
	private final CategoryMapper categoryMapper;
	private final SubCategoryMapper subCategoryMapper;

	public RequestStatisticsService(RequestRepository requestRepository, CategoryRepository categoryRepository,
			SubCategoryRepository subCategoryRepository, RequestMapper requestMapper, CategoryMapper categoryMapper,
			SubCategoryMapper subCategoryMapper) {
		super();
		this.requestRepository = requestRepository;
		this.categoryRepository = categoryRepository;
		this.subCategoryRepository = subCategoryRepository;
		this.requestMapper = requestMapper;
		this.categoryMapper = categoryMapper;
		this.subCategoryMapper = subCategoryMapper;
	}

	public RequestStatisticsDTO getStatistics() {

		List<Request> requests = requestRepository.findAll();
		int totalRequests = requests.size();

		if (totalRequests == 0) {

			return requestMapper.toStatisticsResponse(0, 0, 0, 0, 0, 0.0);
		}

		int receivedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RECEIVED).count();
		int inProgressRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.IN_PROGRESS)
				.count();
		int resolvedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RESOLVED).count();
		int cancelledRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.CANCELLED).count();

		double resolutionRate = (resolvedRequests * 100.0) / totalRequests;

		return requestMapper.toStatisticsResponse(totalRequests, receivedRequests, inProgressRequests, resolvedRequests,
				cancelledRequests, resolutionRate);
	}

	public CategoryStatisticsDTO getCategoryStatistics(String categoryId) {

		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category not found"));

		List<Request> requests = requestRepository.findByCategoryId(categoryId);
		int totalRequests = requests.size();

		if (totalRequests == 0) {

			return categoryMapper.toStatisticsResponse(category.getId(), category.getName(), 0, 0, 0, 0, 0, 0.0);
		}

		int receivedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RECEIVED).count();
		int inProgressRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.IN_PROGRESS)
				.count();
		int resolvedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RESOLVED).count();
		int cancelledRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.CANCELLED).count();
		double resolutionRate = (resolvedRequests * 100.0) / totalRequests;

		return categoryMapper.toStatisticsResponse(category.getId(), category.getName(), totalRequests,
				receivedRequests, inProgressRequests, resolvedRequests, cancelledRequests, resolutionRate);
	}

	public SubCategoryStatisticsDTO getSubCategoryStatistics(String subCategoryId) {

		SubCategory subCategory = subCategoryRepository.findById(subCategoryId)
				.orElseThrow(() -> new ResourceNotFoundException("SubCategory not found"));

		List<Request> requests = requestRepository.findBySubCategoryId(subCategoryId);
		int totalRequests = requests.size();

		if (totalRequests == 0) {

			return subCategoryMapper.toStatisticsResponse(subCategory.getId(), subCategory.getName(), 0, 0, 0, 0, 0,
					0.0);
		}

		int receivedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RECEIVED).count();
		int inProgressRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.IN_PROGRESS)
				.count();
		int resolvedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RESOLVED).count();
		int cancelledRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.CANCELLED).count();
		double resolutionRate = (resolvedRequests * 100.0) / totalRequests;

		return subCategoryMapper.toStatisticsResponse(subCategory.getId(), subCategory.getName(), totalRequests,
				receivedRequests, inProgressRequests, resolvedRequests, cancelledRequests, resolutionRate);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\request\RequestValidationService.java

```java
package com.iagomoreira.urbanflow.service.request;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.security.AuthorizationService;

@Service
public class RequestValidationService {

	private final AuthorizationService authorizationService;
	private final UserRepository userRepository;
	private final SubCategoryRepository subCategoryRepository;

	public RequestValidationService(AuthorizationService authorizationService, UserRepository userRepository,
			SubCategoryRepository subCategoryRepository) {
		this.authorizationService = authorizationService;
		this.userRepository = userRepository;
		this.subCategoryRepository = subCategoryRepository;
	}

	public void validateStatusTransition(RequestStatus current, RequestStatus next) {
		switch (current) {
		case RECEIVED:
			if (next != RequestStatus.UNDER_REVIEW && next != RequestStatus.CANCELLED) {
				throw new BusinessException("Invalid status transition");
			}
			break;

		case UNDER_REVIEW:
			if (next != RequestStatus.APPROVED && next != RequestStatus.REJECTED) {
				throw new BusinessException("Invalid status transition");
			}
			break;

		case APPROVED:
			if (next != RequestStatus.IN_PROGRESS) {
				throw new BusinessException("Invalid status transition");
			}
			break;

		case IN_PROGRESS:
			if (next != RequestStatus.RESOLVED) {
				throw new BusinessException("Invalid status transition");
			}
			break;

		case RESOLVED:
		case REJECTED:
		case CANCELLED:
			throw new BusinessException("Request is already finalized");
		}
	}

	public void validateRequestAccess(Request request) {
		authorizationService.validateRequestAccess(request);
	}

	public void validateAuthenticatedUser(String userId) {
		if (!userRepository.existsById(userId)) {
			throw new ResourceNotFoundException("Authenticated user not found");
		}
	}

	public SubCategory validateSubCategory(CreateRequestDTO dto) {
		SubCategory subCategory = subCategoryRepository.findById(dto.getSubCategoryId())
				.orElseThrow(() -> new ResourceNotFoundException("SubCategory not found"));

		if (!subCategory.getCategoryId().equals(dto.getCategoryId())) {
			throw new BusinessException("SubCategory does not belong to the selected category");
		}

		return subCategory;
	}

	public void validateRequestEditable(Request request) {
		if (request.getStatus() == RequestStatus.RESOLVED || request.getStatus() == RequestStatus.CANCELLED) {
			throw new BusinessException("Resolved or cancelled requests cannot be modified");
		}
	}

	public void validateRequestDeletion(Request request) {
		if (request.getStatus() == RequestStatus.RESOLVED) {
			throw new BusinessException("Resolved requests cannot be deleted");
		}
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\request\RequestWorkflowService.java

```java
package com.iagomoreira.urbanflow.service.request;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestStatusDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.RequestHistory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestHistoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@Service
public class RequestWorkflowService {

	private final RequestRepository requestRepository;
	private final RequestValidationService requestValidationService;
	private final SecurityService securityService;
	private final RequestHistoryRepository requestHistoryRepository;
	private final RequestMapper requestMapper;

	public RequestWorkflowService(RequestRepository requestRepository,
			RequestValidationService requestValidationService, SecurityService securityService,
			RequestHistoryRepository requestHistoryRepository, RequestMapper requestMapper) {
		super();
		this.requestRepository = requestRepository;
		this.requestValidationService = requestValidationService;
		this.securityService = securityService;
		this.requestHistoryRepository = requestHistoryRepository;
		this.requestMapper = requestMapper;
	}

	public RequestResponseDTO updateStatus(String id, UpdateRequestStatusDTO dto) {

		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		requestValidationService.validateRequestAccess(request);
		requestValidationService.validateStatusTransition(request.getStatus(), dto.getStatus());

		RequestStatus oldStatus = request.getStatus();

		request.setStatus(dto.getStatus());
		request.setUpdatedAt(LocalDateTime.now());

		RequestHistory history = new RequestHistory();
		history.setRequestId(request.getId());
		history.setOldStatus(oldStatus);
		history.setNewStatus(dto.getStatus());
		history.setChangedBy(securityService.getAuthenticatedEmail());
		history.setNote(dto.getNote());
		history.setChangedAt(LocalDateTime.now());

		requestHistoryRepository.save(history);
		request = requestRepository.save(request);

		return requestMapper.toResponse(request);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\requesthistory\RequestHistoryQueryService.java

```java
package com.iagomoreira.urbanflow.service.requesthistory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.RequestHistoryMapper;
import com.iagomoreira.urbanflow.repository.RequestHistoryRepository;

@Service
public class RequestHistoryQueryService {

	private final RequestHistoryRepository requestHistoryRepository;
	private final RequestHistoryValidationService requestHistoryValidationService;
	private final RequestHistoryMapper requestHistoryMapper;

	public RequestHistoryQueryService(RequestHistoryRepository requestHistoryRepository,
			RequestHistoryValidationService requestHistoryValidationService,
			RequestHistoryMapper requestHistoryMapper) {
		this.requestHistoryRepository = requestHistoryRepository;
		this.requestHistoryValidationService = requestHistoryValidationService;
		this.requestHistoryMapper = requestHistoryMapper;
	}

	public List<RequestHistoryResponseDTO> findByRequest(String requestId) {
		requestHistoryValidationService.validateRequest(requestId);
		return requestHistoryRepository.findByRequestIdOrderByChangedAtAsc(requestId).stream()
				.map(requestHistoryMapper::toResponse).toList();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\requesthistory\RequestHistoryService.java

```java
package com.iagomoreira.urbanflow.service.requesthistory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;

@Service
public class RequestHistoryService {

	private final RequestHistoryQueryService requestHistoryQueryService;

	public RequestHistoryService(RequestHistoryQueryService requestHistoryQueryService) {
		super();
		this.requestHistoryQueryService = requestHistoryQueryService;
	}

	public List<RequestHistoryResponseDTO> findByRequest(String requestId) {
		return requestHistoryQueryService.findByRequest(requestId);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\service\requesthistory\RequestHistoryValidationService.java

```java
package com.iagomoreira.urbanflow.service.requesthistory;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@Service
public class RequestHistoryValidationService {

	private final RequestRepository requestRepository;

	public RequestHistoryValidationService(RequestRepository requestRepository) {
		super();
		this.requestRepository = requestRepository;
	}

	public void validateRequest(String requestId) {
		if (!requestRepository.existsById(requestId)) {
			throw new ResourceNotFoundException("Request not found");
		}
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\security\AuthorizationService.java

```java
package com.iagomoreira.urbanflow.service.security;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.model.Request;

@Service
public class AuthorizationService {

	private final SecurityService securityService;

	public AuthorizationService(SecurityService securityService) {
		this.securityService = securityService;
	}

	public void validateRequestAccess(Request request) {
		if (securityService.isAdmin()) {
			return;
		}
		if (securityService.isOperator()) {
			if (!securityService.getAuthenticatedDepartmentId().equals(request.getDepartmentId())) {
				throw new BusinessException("Access denied");
			}
			return;
		}
		if (securityService.isCitizen()) {
			if (!securityService.getAuthenticatedUserId().equals(request.getUserId())) {
				throw new BusinessException("Access denied");
			}
		}
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\security\SecurityService.java

```java
package com.iagomoreira.urbanflow.service.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.security.UserDetailsImplementation;

@Service
public class SecurityService {

	public UserDetailsImplementation getAuthenticatedUser() {
		return (UserDetailsImplementation) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

	public String getAuthenticatedEmail() {
		return getAuthenticatedUser().getUsername();
	}

	public String getAuthenticatedUserId() {
		return getAuthenticatedUser().getId();
	}

	public String getAuthenticatedDepartmentId() {
		return getAuthenticatedUser().getDepartmentId();
	}

	public Role getAuthenticatedRole() {
		return getAuthenticatedUser().getRole();
	}

	public boolean isAdmin() {
		return getAuthenticatedRole() == Role.ADMIN;
	}

	public boolean isOperator() {
		return getAuthenticatedRole() == Role.OPERATOR;
	}

	public boolean isCitizen() {
		return getAuthenticatedRole() == Role.CITIZEN;
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\subcategory\SubCategoryCommandService.java

```java
package com.iagomoreira.urbanflow.service.subcategory;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.mapper.SubCategoryMapper;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class SubCategoryCommandService {

	private final SubCategoryRepository subCategoryRepository;
	private final SubCategoryValidationService subCategoryValidationService;
	private final SubCategoryMapper subCategoryMapper;

	public SubCategoryCommandService(SubCategoryRepository subCategoryRepository,
			SubCategoryValidationService subCategoryValidationService, SubCategoryMapper subCategoryMapper) {

		this.subCategoryRepository = subCategoryRepository;
		this.subCategoryValidationService = subCategoryValidationService;
		this.subCategoryMapper = subCategoryMapper;
	}

	public SubCategoryResponseDTO create(CreateSubCategoryDTO dto) {

		subCategoryValidationService.validateCategoryExists(dto.getCategoryId());
		subCategoryValidationService.validateDepartmentExists(dto.getDepartmentId());

		SubCategory subCategory = subCategoryMapper.toEntity(dto);

		subCategory = subCategoryRepository.save(subCategory);
		return subCategoryMapper.toResponse(subCategory);
	}

	public SubCategoryResponseDTO update(String id, UpdateSubCategoryDTO dto) {

		SubCategory subCategory = subCategoryValidationService.validateSubCategoryExists(id);
		subCategoryValidationService.validateCategoryExists(dto.getCategoryId());
		subCategoryValidationService.validateDepartmentExists(dto.getDepartmentId());

		subCategoryMapper.updateEntity(subCategory, dto);

		subCategory = subCategoryRepository.save(subCategory);
		return subCategoryMapper.toResponse(subCategory);
	}

	public void delete(String id) {

		subCategoryValidationService.validateSubCategoryExists(id);
		subCategoryRepository.deleteById(id);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\subcategory\SubCategoryQueryService.java

```java
package com.iagomoreira.urbanflow.service.subcategory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.SubCategoryMapper;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class SubCategoryQueryService {

	private final SubCategoryRepository subCategoryRepository;
	private final SubCategoryValidationService subCategoryValidationService;
	private final SubCategoryMapper subCategoryMapper;

	public SubCategoryQueryService(SubCategoryRepository subCategoryRepository,
			SubCategoryValidationService subCategoryValidationService, SubCategoryMapper subCategoryMapper) {
		this.subCategoryRepository = subCategoryRepository;
		this.subCategoryValidationService = subCategoryValidationService;
		this.subCategoryMapper = subCategoryMapper;
	}

	public List<SubCategoryResponseDTO> findAll() {
		return subCategoryRepository.findAll().stream().map(subCategoryMapper::toResponse).toList();
	}

	public SubCategoryResponseDTO findById(String id) {
		SubCategory subCategory = subCategoryValidationService.validateSubCategoryExists(id);
		return subCategoryMapper.toResponse(subCategory);
	}

	public List<SubCategoryResponseDTO> findByCategory(String categoryId) {
		subCategoryValidationService.validateCategoryExists(categoryId);
		return subCategoryRepository.findByCategoryId(categoryId).stream().map(subCategoryMapper::toResponse).toList();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\subcategory\SubCategoryService.java

```java
package com.iagomoreira.urbanflow.service.subcategory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;

@Service
public class SubCategoryService {

	private final SubCategoryCommandService subCategoryCommandService;
	private final SubCategoryQueryService subCategoryQueryService;

	public SubCategoryService(SubCategoryCommandService subCategoryCommandService,
			SubCategoryQueryService subCategoryQueryService) {
		super();
		this.subCategoryCommandService = subCategoryCommandService;
		this.subCategoryQueryService = subCategoryQueryService;
	}

	public SubCategoryResponseDTO create(CreateSubCategoryDTO dto) {
		return subCategoryCommandService.create(dto);
	}

	public List<SubCategoryResponseDTO> findAll() {
		return subCategoryQueryService.findAll();
	}

	public SubCategoryResponseDTO findById(String id) {
		return subCategoryQueryService.findById(id);
	}

	public List<SubCategoryResponseDTO> findByCategory(String categoryId) {
		return subCategoryQueryService.findByCategory(categoryId);
	}

	public SubCategoryResponseDTO update(String id, UpdateSubCategoryDTO dto) {
		return subCategoryCommandService.update(id, dto);
	}

	public void delete(String id) {
		subCategoryCommandService.delete(id);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\subcategory\SubCategoryValidationService.java

```java
package com.iagomoreira.urbanflow.service.subcategory;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class SubCategoryValidationService {

	private final SubCategoryRepository subCategoryRepository;
	private final CategoryRepository categoryRepository;
	private final DepartmentRepository departmentRepository;

	public SubCategoryValidationService(SubCategoryRepository subCategoryRepository,
			CategoryRepository categoryRepository, DepartmentRepository departmentRepository) {
		super();
		this.subCategoryRepository = subCategoryRepository;
		this.categoryRepository = categoryRepository;
		this.departmentRepository = departmentRepository;
	}

	public SubCategory validateSubCategoryExists(String id) {
		return subCategoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("SubCategory not found"));
	}

	public void validateCategoryExists(String categoryId) {
		if (!categoryRepository.existsById(categoryId)) {
			throw new ResourceNotFoundException("Category not found");
		}
	}

	public void validateDepartmentExists(String departmentId) {
		if (!departmentRepository.existsById(departmentId)) {
			throw new ResourceNotFoundException("Department not found");
		}
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\update\UpdateCommandService.java

```java
package com.iagomoreira.urbanflow.service.update;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.mapper.UpdateMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Update;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UpdateRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@Service
public class UpdateCommandService {

	private final UpdateRepository updateRepository;
	private final RequestRepository requestRepository;
	private final UpdateValidationService updateValidationService;
	private final UpdateMapper updateMapper;
	private final DateTimeProvider dateTimeProvider;

	public UpdateCommandService(UpdateRepository updateRepository, RequestRepository requestRepository,
			UpdateValidationService updateValidationService, UpdateMapper updateMapper,
			DateTimeProvider dateTimeProvider) {
		this.updateRepository = updateRepository;
		this.requestRepository = requestRepository;
		this.updateValidationService = updateValidationService;
		this.updateMapper = updateMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public UpdateResponseDTO create(CreateUpdateDTO dto) {
		Request request = updateValidationService.validateRequest(dto.getRequestId());
		Update update = updateMapper.toEntity(dto);

		update.setUpdatedAt(dateTimeProvider.now());
		update = updateRepository.save(update);

		request.setStatus(dto.getStatus());
		request.setUpdatedAt(dateTimeProvider.now());
		requestRepository.save(request);

		return updateMapper.toResponse(update);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\update\UpdateQueryService.java

```java
package com.iagomoreira.urbanflow.service.update;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.mapper.UpdateMapper;
import com.iagomoreira.urbanflow.repository.UpdateRepository;

@Service
public class UpdateQueryService {

	private final UpdateRepository updateRepository;
	private final UpdateValidationService updateValidationService;
	private final UpdateMapper updateMapper;

	public UpdateQueryService(UpdateRepository updateRepository, UpdateValidationService updateValidationService,
			UpdateMapper updateMapper) {
		this.updateRepository = updateRepository;
		this.updateValidationService = updateValidationService;
		this.updateMapper = updateMapper;
	}

	public List<UpdateResponseDTO> findAll() {
		return updateRepository.findAll().stream().map(updateMapper::toResponse).toList();
	}

	public List<UpdateResponseDTO> findByRequest(String requestId) {
		updateValidationService.validateRequest(requestId);
		return updateRepository.findByRequestIdOrderByUpdatedAtAsc(requestId).stream().map(updateMapper::toResponse)
				.toList();
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\update\UpdateService.java

```java
package com.iagomoreira.urbanflow.service.update;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;

@Service
public class UpdateService {

	private final UpdateCommandService updateCommandService;
	private final UpdateQueryService updateQueryService;

	public UpdateService(UpdateCommandService updateCommandService, UpdateQueryService updateQueryService) {
		super();
		this.updateCommandService = updateCommandService;
		this.updateQueryService = updateQueryService;
	}

	public UpdateResponseDTO create(CreateUpdateDTO dto) {
		return updateCommandService.create(dto);
	}

	public List<UpdateResponseDTO> findAll() {
		return updateQueryService.findAll();
	}

	public List<UpdateResponseDTO> findByRequest(String requestId) {
		return updateQueryService.findByRequest(requestId);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\service\update\UpdateValidationService.java

```java
package com.iagomoreira.urbanflow.service.update;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@Service
public class UpdateValidationService {

	private final RequestRepository requestRepository;

	public UpdateValidationService(RequestRepository requestRepository) {
		super();
		this.requestRepository = requestRepository;
	}

	public Request validateRequest(String requestId) {
		return requestRepository.findById(requestId)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\user\UserCommandService.java

```java
package com.iagomoreira.urbanflow.service.user;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@Service
public class UserCommandService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	private final UserValidationService userValidationService;
	private final UserMapper userMapper;
	private final DateTimeProvider dateTimeProvider;

	public UserCommandService(UserRepository userRepository, PasswordEncoder passwordEncoder,
			UserValidationService userValidationService, UserMapper userMapper, DateTimeProvider dateTimeProvider) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.userValidationService = userValidationService;
		this.userMapper = userMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public UserResponseDTO create(CreateUserDTO dto) {

		userValidationService.validateEmailAlreadyExists(dto.getEmail());
		userValidationService.validateCpfAlreadyExists(dto.getCpf());

		User user = userMapper.toEntity(dto, passwordEncoder.encode(dto.getPassword()));
		user.setRole(Role.CITIZEN);
		user.setDepartmentId(null);
		user.setCreatedAt(dateTimeProvider.now());

		user = userRepository.save(user);
		return userMapper.toResponse(user);
	}

	public UserResponseDTO update(String id, UpdateUserDTO dto) {

		User user = userValidationService.validateUserExists(id);

		userValidationService.validateEmailForUpdate(user, dto.getEmail());
		userMapper.updateEntity(user, dto);

		if (dto.getPassword() != null && !dto.getPassword().isBlank()) {
			user.setPassword(passwordEncoder.encode(dto.getPassword()));
		}

		user.setUpdatedAt(dateTimeProvider.now());

		user = userRepository.save(user);
		return userMapper.toResponse(user);
	}

	public void delete(String id) {
		userValidationService.validateUserExists(id);
		userRepository.deleteById(id);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\user\UserQueryService.java

```java
package com.iagomoreira.urbanflow.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class UserQueryService {

	private final UserRepository userRepository;
	private final UserValidationService userValidationService;
	private final UserMapper userMapper;

	public UserQueryService(UserRepository userRepository, UserValidationService userValidationService,
			UserMapper userMapper) {
		super();
		this.userRepository = userRepository;
		this.userValidationService = userValidationService;
		this.userMapper = userMapper;
	}

	public UserResponseDTO findById(String id) {
		User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
		return userMapper.toResponse(user);
	}

	public List<UserResponseDTO> findAll() {
		List<User> users = userRepository.findAll();
		return users.stream().map(userMapper::toResponse).toList();
	}

	public List<UserResponseDTO> findOperatorsByDepartment(String departmentId) {
		userValidationService.validateDepartmentExists(departmentId);
		return userRepository.findByRoleAndDepartmentId(Role.OPERATOR, departmentId).stream()
				.map(userMapper::toResponse).toList();
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\service\user\UserService.java

```java
package com.iagomoreira.urbanflow.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;

@Service
public class UserService {

	private final UserCommandService userCommandService;
	private final UserQueryService userQueryService;

	public UserService(UserCommandService userCommandService, UserQueryService userQueryService) {
		super();
		this.userCommandService = userCommandService;
		this.userQueryService = userQueryService;
	}

	public UserResponseDTO create(CreateUserDTO dto) {
		return userCommandService.create(dto);
	}

	public UserResponseDTO update(String id, UpdateUserDTO dto) {
		return userCommandService.update(id, dto);
	}

	public void delete(String id) {
		userCommandService.delete(id);
	}

	public UserResponseDTO findById(String id) {
		return userQueryService.findById(id);
	}

	public List<UserResponseDTO> findAll() {
		return userQueryService.findAll();
	}

	public List<UserResponseDTO> findOperatorsByDepartment(String departmentId) {
		return userQueryService.findOperatorsByDepartment(departmentId);
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\service\user\UserValidationService.java

```java
package com.iagomoreira.urbanflow.service.user;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class UserValidationService {

	private final UserRepository userRepository;
	private final DepartmentRepository departmentRepository;

	public UserValidationService(UserRepository userRepository, DepartmentRepository departmentRepository) {
		super();
		this.userRepository = userRepository;
		this.departmentRepository = departmentRepository;
	}

	public void validateEmailAlreadyExists(String email) {
		if (userRepository.existsByEmail(email)) {
			throw new BusinessException("Email already registered");
		}
	}

	public void validateCpfAlreadyExists(String cpf) {
		if (userRepository.existsByCpf(cpf)) {
			throw new BusinessException("CPF already registered");
		}
	}

	public User validateUserExists(String id) {
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
	}

	public void validateEmailForUpdate(User user, String newEmail) {
		if (!user.getEmail().equals(newEmail) && userRepository.existsByEmail(newEmail)) {
			throw new BusinessException("Email already registered");
		}
	}

	public void validateDepartment(Role role, String departmentId) {

		if (role == Role.OPERATOR) {
			if (departmentId == null || departmentId.isBlank()) {
				throw new BusinessException("Operator must belong to a department");
			}
			if (!departmentRepository.existsById(departmentId)) {
				throw new ResourceNotFoundException("Department not found");
			}
		}
	}

	public void validateDepartmentExists(String departmentId) {
		if (!departmentRepository.existsById(departmentId)) {
			throw new ResourceNotFoundException("Department not found");
		}
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\vote\VoteCommandService.java

```java
package com.iagomoreira.urbanflow.service.vote;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.mapper.VoteMapper;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.repository.VoteRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@Service
public class VoteCommandService {

	private final VoteRepository voteRepository;
	private final VoteValidationService voteValidationService;
	private final SecurityService securityService;
	private final VoteMapper voteMapper;
	private final DateTimeProvider dateTimeProvider;

	public VoteCommandService(VoteRepository voteRepository, VoteValidationService voteValidationService,
			SecurityService securityService, VoteMapper voteMapper, DateTimeProvider dateTimeProvider) {
		this.voteRepository = voteRepository;
		this.voteValidationService = voteValidationService;
		this.securityService = securityService;
		this.voteMapper = voteMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public VoteResponseDTO create(CreateVoteDTO dto) {
		String userId = securityService.getAuthenticatedUserId();

		voteValidationService.validateRequest(dto.getRequestId());
		voteValidationService.validateOwnVote(userId, dto.getRequestId());
		voteValidationService.validateDuplicateVote(userId, dto.getRequestId());

		Vote vote = voteMapper.toEntity(dto, userId);
		vote.setCreatedAt(dateTimeProvider.now());

		vote = voteRepository.save(vote);
		return voteMapper.toResponse(vote);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\vote\VoteQueryService.java

```java
package com.iagomoreira.urbanflow.service.vote;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.mapper.VoteMapper;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@Service
public class VoteQueryService {

	private final VoteRepository voteRepository;
	private final VoteValidationService voteValidationService;
	private final VoteMapper voteMapper;

	public VoteQueryService(VoteRepository voteRepository, VoteValidationService voteValidationService,
			VoteMapper voteMapper) {
		this.voteRepository = voteRepository;
		this.voteValidationService = voteValidationService;
		this.voteMapper = voteMapper;
	}

	public List<VoteResponseDTO> findAll() {
		return voteRepository.findAll().stream().map(voteMapper::toResponse).toList();
	}

	public List<VoteResponseDTO> findByRequest(String requestId) {
		voteValidationService.validateRequest(requestId);
		return voteRepository.findByRequestId(requestId).stream().map(voteMapper::toResponse).toList();
	}

	public RequestPriorityDTO getRequestPriority(String requestId) {
		voteValidationService.validateRequest(requestId);
		List<Vote> votes = voteRepository.findByRequestId(requestId);

		int totalVotes = votes.size();

		if (totalVotes == 0) {
			return voteMapper.toPriorityResponse(0, 0, 0, 0, 0.0, 0.0, 0.0);
		}

		long lowVotes = votes.stream().filter(v -> v.getPriorityLevel() == PriorityLevel.LOW).count();
		long mediumVotes = votes.stream().filter(v -> v.getPriorityLevel() == PriorityLevel.MEDIUM).count();
		long highVotes = votes.stream().filter(v -> v.getPriorityLevel() == PriorityLevel.HIGH).count();

		double lowPercentage = lowVotes * 100.0 / totalVotes;
		double mediumPercentage = mediumVotes * 100.0 / totalVotes;
		double highPercentage = highVotes * 100.0 / totalVotes;

		return voteMapper.toPriorityResponse((int) lowVotes, (int) mediumVotes, (int) highVotes, totalVotes,
				lowPercentage, mediumPercentage, highPercentage);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\vote\VoteService.java

```java
package com.iagomoreira.urbanflow.service.vote;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;

@Service
public class VoteService {

	private final VoteCommandService voteCommandService;
	private final VoteQueryService voteQueryService;

	public VoteService(VoteCommandService voteCommandService, VoteQueryService voteQueryService) {
		super();
		this.voteCommandService = voteCommandService;
		this.voteQueryService = voteQueryService;
	}

	public VoteResponseDTO create(CreateVoteDTO dto) {
		return voteCommandService.create(dto);
	}

	public List<VoteResponseDTO> findAll() {
		return voteQueryService.findAll();
	}

	public List<VoteResponseDTO> findByRequest(String requestId) {
		return voteQueryService.findByRequest(requestId);
	}

	public RequestPriorityDTO getRequestPriority(String requestId) {
		return voteQueryService.getRequestPriority(requestId);
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\service\vote\VoteValidationService.java

```java
package com.iagomoreira.urbanflow.service.vote;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@Service
public class VoteValidationService {

	private final VoteRepository voteRepository;
	private final UserRepository userRepository;
	private final RequestRepository requestRepository;

	public VoteValidationService(VoteRepository voteRepository, UserRepository userRepository,
			RequestRepository requestRepository) {
		super();
		this.voteRepository = voteRepository;
		this.userRepository = userRepository;
		this.requestRepository = requestRepository;
	}

	public void validateUser(String userId) {
		if (!userRepository.existsById(userId)) {
			throw new ResourceNotFoundException("User not found");
		}
	}

	public Request validateRequest(String requestId) {
		return requestRepository.findById(requestId)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));
	}

	public void validateDuplicateVote(String userId, String requestId) {
		if (voteRepository.existsByUserIdAndRequestId(userId, requestId)) {
			throw new BusinessException("User has already voted on this request");
		}
	}

	public void validateOwnVote(String userId, String requestId) {

		Request request = validateRequest(requestId);
		if (request.getUserId().equals(userId)) {
			throw new BusinessException("Users cannot vote on their own requests");
		}
	}
}
```

# src\main\java\com\iagomoreira\urbanflow\UrbanflowApplication.java

```java
package com.iagomoreira.urbanflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UrbanflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrbanflowApplication.class, args);
	}

}

```

# src\main\java\com\iagomoreira\urbanflow\validation\CpfValidator.java

```java
package com.iagomoreira.urbanflow.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CpfValidator implements ConstraintValidator<ValidCpf, String> {

	@Override
	public boolean isValid(String cpf, ConstraintValidatorContext context) {

		if (cpf == null || cpf.isBlank()) {
			return false;
		}

		cpf = cpf.replaceAll("[^\\d]", "");

		if (cpf.length() != 11) {
			return false;
		}

		if (cpf.matches("(\\d)\\1{10}")) {
			return false;
		}

		try {
			return isValidCpfDigits(cpf);
		} catch (Exception e) {
			return false;
		}
	}

	private boolean isValidCpfDigits(String cpf) {

		int sum = 0;

		for (int i = 0; i < 9; i++) {
			sum += (cpf.charAt(i) - '0') * (10 - i);
		}

		int firstDigit = 11 - (sum % 11);
		firstDigit = (firstDigit >= 10) ? 0 : firstDigit;

		if (firstDigit != (cpf.charAt(9) - '0')) {
			return false;
		}

		sum = 0;

		for (int i = 0; i < 10; i++) {
			sum += (cpf.charAt(i) - '0') * (11 - i);
		}

		int secondDigit = 11 - (sum % 11);
		secondDigit = (secondDigit >= 10) ? 0 : secondDigit;

		return secondDigit == (cpf.charAt(10) - '0');
	}
}

```

# src\main\java\com\iagomoreira\urbanflow\validation\ValidCpf.java

```java
package com.iagomoreira.urbanflow.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = CpfValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidCpf {

	String message() default "Invalid CPF";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}

```

# src\main\resources\application.properties

```properties
spring.application.name=urbanflow

spring.data.mongodb.uri=mongodb://localhost:27017/urbanflow
springdoc.swagger-ui.path=/swagger-ui.html

jwt.secret=81149690@Urbanflow-key-for-the-API
jwt.expiration=86400000

server.error.include-message=always
server.error.include-binding-errors=always

logging:
  level:
    com.iagomoreira.urbanflow.security: DEBUG
    org.springframework.security: DEBUG
```

# src\test\java\com\iagomoreira\urbanflow\config\ControllerTestConfig.java

```java
package com.iagomoreira.urbanflow.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.fasterxml.jackson.databind.ObjectMapper;

@TestConfiguration
@EnableMethodSecurity(prePostEnabled = false)
public class ControllerTestConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth -> auth.anyRequest().permitAll());

		return http.build();
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\AbstractControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.context.annotation.Import;

import com.iagomoreira.urbanflow.config.ControllerTestConfig;

@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
public abstract class AbstractControllerTest {

}
```

# src\test\java\com\iagomoreira\urbanflow\controller\AuthControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.service.auth.AuthService;
import com.iagomoreira.urbanflow.service.auth.TokenService;

@WebMvcTest(AuthController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class AuthControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private AuthService authService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private LoginDTO loginDTO;
	private LoginResponseDTO loginResponseDTO;
	private UserResponseDTO userResponseDTO;
	private final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
	private final String userId = "user-123";
	private final String email = "maria.patos@example.com";

	@BeforeEach
	void setUp() {
		loginDTO = new LoginDTO();
		loginDTO.setEmail("maria.patos@example.com");
		loginDTO.setPassword("patos123");

		loginResponseDTO = new LoginResponseDTO(token);

		userResponseDTO = new UserResponseDTO();
		userResponseDTO.setId(userId);
		userResponseDTO.setName("Maria Patos");
		userResponseDTO.setEmail(email);
		userResponseDTO.setRole(Role.CITIZEN);
		userResponseDTO.setDepartmentId(null);
		userResponseDTO.setAddress(null);
		userResponseDTO.setCreatedAt(LocalDateTime.now().minusDays(1));
		userResponseDTO.setUpdatedAt(LocalDateTime.now());
	}

	@Test
	void shouldLogin() throws Exception {
		when(authService.login(any(LoginDTO.class))).thenReturn(loginResponseDTO);

		mockMvc.perform(
				post("/auth/login").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(loginDTO)))
				.andExpect(status().isOk()).andExpect(jsonPath("$.token").value(token));

		verify(authService).login(any(LoginDTO.class));
	}

	@Test
	void shouldGetCurrentUser() throws Exception {
		when(authService.getCurrentUser()).thenReturn(userResponseDTO);

		mockMvc.perform(get("/auth/me")).andExpect(status().isOk()).andExpect(jsonPath("$.id").value(userId))
				.andExpect(jsonPath("$.name").value("Maria Patos")).andExpect(jsonPath("$.email").value(email))
				.andExpect(jsonPath("$.role").value("CITIZEN"));

		verify(authService).getCurrentUser();
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\CategoryControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.category.CategoryService;

@WebMvcTest(CategoryController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class CategoryControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private CategoryService categoryService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateCategoryDTO createDTO;
	private UpdateCategoryDTO updateDTO;
	private CategoryResponseDTO responseDTO;

	@BeforeEach
	void setUp() {
		createDTO = new CreateCategoryDTO();
		createDTO.setName("Infrastructure");
		createDTO.setDescription("Infrastructure category description");
		createDTO.setDepartmentId("dep-1");

		updateDTO = new UpdateCategoryDTO();
		updateDTO.setName("Infrastructure Updated");
		updateDTO.setDescription("Updated description");
		updateDTO.setDepartmentId("dep-1");

		responseDTO = new CategoryResponseDTO();
		responseDTO.setId("cat-1");
		responseDTO.setName("Infrastructure");
		responseDTO.setDescription("Infrastructure category description");
		responseDTO.setDepartmentId("dep-1");
	}

	@Test
	void shouldCreateCategory() throws Exception {
		when(categoryService.create(any(CreateCategoryDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/categories").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value("cat-1"))
				.andExpect(jsonPath("$.name").value("Infrastructure"))
				.andExpect(jsonPath("$.description").value("Infrastructure category description"))
				.andExpect(jsonPath("$.departmentId").value("dep-1"));

		verify(categoryService).create(any(CreateCategoryDTO.class));
	}

	@Test
	void shouldFindAllCategories() throws Exception {
		when(categoryService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/categories")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value("cat-1")).andExpect(jsonPath("$[0].name").value("Infrastructure"))
				.andExpect(jsonPath("$[0].description").value("Infrastructure category description"))
				.andExpect(jsonPath("$[0].departmentId").value("dep-1"));

		verify(categoryService).findAll();
	}

	@Test
	void shouldFindCategoryById() throws Exception {
		when(categoryService.findById("cat-1")).thenReturn(responseDTO);

		mockMvc.perform(get("/categories/{id}", "cat-1")).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("cat-1")).andExpect(jsonPath("$.name").value("Infrastructure"))
				.andExpect(jsonPath("$.description").value("Infrastructure category description"))
				.andExpect(jsonPath("$.departmentId").value("dep-1"));

		verify(categoryService).findById("cat-1");
	}

	@Test
	void shouldUpdateCategory() throws Exception {
		responseDTO.setName("Infrastructure Updated");
		responseDTO.setDescription("Updated description");

		when(categoryService.update(eq("cat-1"), any(UpdateCategoryDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(put("/categories/{id}", "cat-1").contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateDTO))).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("cat-1"))
				.andExpect(jsonPath("$.name").value("Infrastructure Updated"))
				.andExpect(jsonPath("$.description").value("Updated description"))
				.andExpect(jsonPath("$.departmentId").value("dep-1"));

		verify(categoryService).update(eq("cat-1"), any(UpdateCategoryDTO.class));
	}

	@Test
	void shouldDeleteCategory() throws Exception {
		doNothing().when(categoryService).delete("cat-1");

		mockMvc.perform(delete("/categories/{id}", "cat-1")).andExpect(status().isNoContent());

		verify(categoryService).delete("cat-1");
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\DashboardControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.dashboard.DashboardService;

@WebMvcTest(DashboardController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class DashboardControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private DashboardService dashboardService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private DashboardStatisticsDTO statisticsDTO;
	private List<TopCategoryDTO> topCategories;
	private List<TopSubCategoryDTO> topSubCategories;
	private DashboardOverviewDTO overviewDTO;

	private final String categoryId1 = "cat-1";
	private final String categoryId2 = "cat-2";
	private final String subCategoryId1 = "sub-1";
	private final String subCategoryId2 = "sub-2";

	@BeforeEach
	void setUp() {
		statisticsDTO = new DashboardStatisticsDTO();
		statisticsDTO.setTotalRequests(150);
		statisticsDTO.setReceivedRequests(30);
		statisticsDTO.setInProgressRequests(45);
		statisticsDTO.setResolvedRequests(60);
		statisticsDTO.setCancelledRequests(15);
		statisticsDTO.setResolutionRate(40.0);
		statisticsDTO.setTotalUsers(80);
		statisticsDTO.setTotalVotes(120);
		statisticsDTO.setTotalFeedbacks(45);
		statisticsDTO.setAverageRating(4.2);

		TopCategoryDTO top1 = new TopCategoryDTO();
		top1.setCategoryId(categoryId1);
		top1.setCategoryName("Infraestrutura");
		top1.setTotalRequests(50);

		TopCategoryDTO top2 = new TopCategoryDTO();
		top2.setCategoryId(categoryId2);
		top2.setCategoryName("Limpeza Urbana");
		top2.setTotalRequests(30);

		topCategories = List.of(top1, top2);

		TopSubCategoryDTO sub1 = new TopSubCategoryDTO();
		sub1.setSubCategoryId(subCategoryId1);
		sub1.setSubCategoryName("Pavimentação");
		sub1.setTotalRequests(25);

		TopSubCategoryDTO sub2 = new TopSubCategoryDTO();
		sub2.setSubCategoryId(subCategoryId2);
		sub2.setSubCategoryName("Coleta de Lixo");
		sub2.setTotalRequests(18);

		topSubCategories = List.of(sub1, sub2);

		overviewDTO = new DashboardOverviewDTO();
		overviewDTO.setTotalRequests(150L);
		overviewDTO.setReceivedRequests(30L);
		overviewDTO.setUnderReviewRequests(10L);
		overviewDTO.setApprovedRequests(5L);
		overviewDTO.setInProgressRequests(45L);
		overviewDTO.setResolvedRequests(60L);
		overviewDTO.setCancelledRequests(15L);
		overviewDTO.setRejectedRequests(5L);
		overviewDTO.setTotalUsers(80L);
		overviewDTO.setTotalVotes(120L);
		overviewDTO.setAverageRating(4.2);
	}

	@Test
	void shouldGetStatistics() throws Exception {
		when(dashboardService.getStatistics()).thenReturn(statisticsDTO);

		mockMvc.perform(get("/dashboard/statistics")).andExpect(status().isOk())
				.andExpect(jsonPath("$.totalRequests").value(150)).andExpect(jsonPath("$.receivedRequests").value(30))
				.andExpect(jsonPath("$.inProgressRequests").value(45))
				.andExpect(jsonPath("$.resolvedRequests").value(60))
				.andExpect(jsonPath("$.cancelledRequests").value(15))
				.andExpect(jsonPath("$.resolutionRate").value(40.0)).andExpect(jsonPath("$.totalUsers").value(80))
				.andExpect(jsonPath("$.totalVotes").value(120)).andExpect(jsonPath("$.totalFeedbacks").value(45))
				.andExpect(jsonPath("$.averageRating").value(4.2));

		verify(dashboardService).getStatistics();
	}

	@Test
	void shouldGetTopCategories() throws Exception {
		when(dashboardService.getTopCategories()).thenReturn(topCategories);

		mockMvc.perform(get("/dashboard/top-categories")).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(2)).andExpect(jsonPath("$[0].categoryId").value(categoryId1))
				.andExpect(jsonPath("$[0].categoryName").value("Infraestrutura"))
				.andExpect(jsonPath("$[0].totalRequests").value(50))
				.andExpect(jsonPath("$[1].categoryId").value(categoryId2))
				.andExpect(jsonPath("$[1].categoryName").value("Limpeza Urbana"))
				.andExpect(jsonPath("$[1].totalRequests").value(30));

		verify(dashboardService).getTopCategories();
	}

	@Test
	void shouldGetTopSubCategories() throws Exception {
		when(dashboardService.getTopSubCategories()).thenReturn(topSubCategories);

		mockMvc.perform(get("/dashboard/top-subcategories")).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(2))
				.andExpect(jsonPath("$[0].subCategoryId").value(subCategoryId1))
				.andExpect(jsonPath("$[0].subCategoryName").value("Pavimentação"))
				.andExpect(jsonPath("$[0].totalRequests").value(25))
				.andExpect(jsonPath("$[1].subCategoryId").value(subCategoryId2))
				.andExpect(jsonPath("$[1].subCategoryName").value("Coleta de Lixo"))
				.andExpect(jsonPath("$[1].totalRequests").value(18));

		verify(dashboardService).getTopSubCategories();
	}

	@Test
	void shouldGetOverview() throws Exception {
		when(dashboardService.getOverview()).thenReturn(overviewDTO);

		mockMvc.perform(get("/dashboard/overview")).andExpect(status().isOk())
				.andExpect(jsonPath("$.totalRequests").value(150)).andExpect(jsonPath("$.receivedRequests").value(30))
				.andExpect(jsonPath("$.underReviewRequests").value(10))
				.andExpect(jsonPath("$.approvedRequests").value(5))
				.andExpect(jsonPath("$.inProgressRequests").value(45))
				.andExpect(jsonPath("$.resolvedRequests").value(60))
				.andExpect(jsonPath("$.cancelledRequests").value(15)).andExpect(jsonPath("$.rejectedRequests").value(5))
				.andExpect(jsonPath("$.totalUsers").value(80)).andExpect(jsonPath("$.totalVotes").value(120))
				.andExpect(jsonPath("$.averageRating").value(4.2));

		verify(dashboardService).getOverview();
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\DepartmentControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.department.DepartmentService;

@WebMvcTest(DepartmentController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class DepartmentControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private DepartmentService departmentService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateDepartmentDTO createDTO;
	private UpdateDepartmentDTO updateDTO;
	private DepartmentResponseDTO responseDTO;

	@BeforeEach
	void setUp() {
		createDTO = new CreateDepartmentDTO();
		createDTO.setName("Infrastructure");
		createDTO.setDescription("Infrastructure department description");

		updateDTO = new UpdateDepartmentDTO();
		updateDTO.setName("Infrastructure Updated");
		updateDTO.setDescription("Updated description");

		responseDTO = new DepartmentResponseDTO();
		responseDTO.setId("dep-1");
		responseDTO.setName("Infrastructure");
		responseDTO.setDescription("Infrastructure department description");
	}

	@Test
	void shouldCreateDepartment() throws Exception {
		when(departmentService.create(any(CreateDepartmentDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/departments").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(header().exists("Location"))
				.andExpect(jsonPath("$.id").value("dep-1")).andExpect(jsonPath("$.name").value("Infrastructure"))
				.andExpect(jsonPath("$.description").value("Infrastructure department description"));

		verify(departmentService).create(any(CreateDepartmentDTO.class));
	}

	@Test
	void shouldFindAllDepartments() throws Exception {
		when(departmentService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/departments")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value("dep-1")).andExpect(jsonPath("$[0].name").value("Infrastructure"))
				.andExpect(jsonPath("$[0].description").value("Infrastructure department description"));

		verify(departmentService).findAll();
	}

	@Test
	void shouldFindDepartmentById() throws Exception {
		when(departmentService.findById("dep-1")).thenReturn(responseDTO);

		mockMvc.perform(get("/departments/{id}", "dep-1")).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("dep-1")).andExpect(jsonPath("$.name").value("Infrastructure"))
				.andExpect(jsonPath("$.description").value("Infrastructure department description"));

		verify(departmentService).findById("dep-1");
	}

	@Test
	void shouldUpdateDepartment() throws Exception {
		responseDTO.setName("Infrastructure Updated");
		responseDTO.setDescription("Updated description");

		when(departmentService.update(eq("dep-1"), any(UpdateDepartmentDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(put("/departments/{id}", "dep-1").contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateDTO))).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("dep-1"))
				.andExpect(jsonPath("$.name").value("Infrastructure Updated"))
				.andExpect(jsonPath("$.description").value("Updated description"));

		verify(departmentService).update(eq("dep-1"), any(UpdateDepartmentDTO.class));
	}

	@Test
	void shouldDeleteDepartment() throws Exception {
		doNothing().when(departmentService).delete("dep-1");

		mockMvc.perform(delete("/departments/{id}", "dep-1")).andExpect(status().isNoContent());

		verify(departmentService).delete("dep-1");
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\FeedbackControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.feedback.FeedbackService;

@WebMvcTest(FeedbackController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class FeedbackControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private FeedbackService feedbackService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateFeedbackDTO createDTO;
	private FeedbackResponseDTO responseDTO;
	private FeedbackStatisticsDTO statisticsDTO;
	private final String feedbackId = "fb-123";
	private final String requestId = "req-456";
	private final String userId = "user-789";

	@BeforeEach
	void setUp() {
		createDTO = new CreateFeedbackDTO();
		createDTO.setRating(5);
		createDTO.setComment("Great service!");
		createDTO.setRequestId(requestId);

		responseDTO = new FeedbackResponseDTO();
		responseDTO.setId(feedbackId);
		responseDTO.setRating(5);
		responseDTO.setComment("Great service!");
		responseDTO.setCreatedAt(LocalDateTime.now());
		responseDTO.setUserId(userId);
		responseDTO.setRequestId(requestId);

		statisticsDTO = new FeedbackStatisticsDTO();
		statisticsDTO.setAverageRating(4.5);
		statisticsDTO.setTotalFeedbacks(10);
		statisticsDTO.setFiveStars(5);
		statisticsDTO.setFourStars(3);
		statisticsDTO.setThreeStars(1);
		statisticsDTO.setTwoStars(1);
		statisticsDTO.setOneStar(0);
		statisticsDTO.setSatisfactionPercentage(80.0);
	}

	@Test
	void shouldCreateFeedback() throws Exception {
		when(feedbackService.create(any(CreateFeedbackDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/feedbacks").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value(feedbackId))
				.andExpect(jsonPath("$.rating").value(5)).andExpect(jsonPath("$.comment").value("Great service!"))
				.andExpect(jsonPath("$.userId").value(userId)).andExpect(jsonPath("$.requestId").value(requestId));

		verify(feedbackService).create(any(CreateFeedbackDTO.class));
	}

	@Test
	void shouldFindAllFeedbacks() throws Exception {
		when(feedbackService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/feedbacks")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(feedbackId)).andExpect(jsonPath("$[0].rating").value(5))
				.andExpect(jsonPath("$[0].comment").value("Great service!"))
				.andExpect(jsonPath("$[0].userId").value(userId))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(feedbackService).findAll();
	}

	@Test
	void shouldFindFeedbacksByRequest() throws Exception {
		when(feedbackService.findByRequest(requestId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/feedbacks/request/{requestId}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(feedbackId))
				.andExpect(jsonPath("$[0].rating").value(5)).andExpect(jsonPath("$[0].comment").value("Great service!"))
				.andExpect(jsonPath("$[0].userId").value(userId))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(feedbackService).findByRequest(requestId);
	}

	@Test
	void shouldGetFeedbackStatistics() throws Exception {
		when(feedbackService.getStatistics(requestId)).thenReturn(statisticsDTO);

		mockMvc.perform(get("/feedbacks/request/{requestId}/statistics", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.averageRating").value(4.5)).andExpect(jsonPath("$.totalFeedbacks").value(10))
				.andExpect(jsonPath("$.fiveStars").value(5)).andExpect(jsonPath("$.fourStars").value(3))
				.andExpect(jsonPath("$.threeStars").value(1)).andExpect(jsonPath("$.twoStars").value(1))
				.andExpect(jsonPath("$.oneStar").value(0)).andExpect(jsonPath("$.satisfactionPercentage").value(80.0));

		verify(feedbackService).getStatistics(requestId);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\LegislationControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.legislation.LegislationService;

@WebMvcTest(LegislationController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class LegislationControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private LegislationService legislationService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private LegislationResponseDTO responseDTO;
	private final String legislationId = "leg-123";
	private final String keyword = "mobilidade";

	@BeforeEach
	void setUp() {
		responseDTO = new LegislationResponseDTO();
		responseDTO.setId(legislationId);
		responseDTO.setTitle("Lei de Mobilidade Urbana");
		responseDTO.setDescription("Regulamenta a mobilidade urbana");
		responseDTO.setDocumentUrl("http://example.com/doc.pdf");
		responseDTO.setKeywords(Arrays.asList("mobilidade", "transporte", "urbano"));
	}

	@Test
	void shouldFindAllLegislations() throws Exception {
		when(legislationService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/legislations")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(legislationId))
				.andExpect(jsonPath("$[0].title").value("Lei de Mobilidade Urbana"))
				.andExpect(jsonPath("$[0].description").value("Regulamenta a mobilidade urbana"))
				.andExpect(jsonPath("$[0].documentUrl").value("http://example.com/doc.pdf"))
				.andExpect(jsonPath("$[0].keywords[0]").value("mobilidade"))
				.andExpect(jsonPath("$[0].keywords[1]").value("transporte"))
				.andExpect(jsonPath("$[0].keywords[2]").value("urbano"));

		verify(legislationService).findAll();
	}

	@Test
	void shouldFindLegislationById() throws Exception {
		when(legislationService.findById(legislationId)).thenReturn(responseDTO);

		mockMvc.perform(get("/legislations/{id}", legislationId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(legislationId))
				.andExpect(jsonPath("$.title").value("Lei de Mobilidade Urbana"))
				.andExpect(jsonPath("$.description").value("Regulamenta a mobilidade urbana"))
				.andExpect(jsonPath("$.documentUrl").value("http://example.com/doc.pdf"))
				.andExpect(jsonPath("$.keywords[0]").value("mobilidade"));

		verify(legislationService).findById(legislationId);
	}

	@Test
	void shouldFindByKeyword() throws Exception {
		when(legislationService.findByKeyword(keyword)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/legislations/search").param("keyword", keyword)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(legislationId))
				.andExpect(jsonPath("$[0].title").value("Lei de Mobilidade Urbana"));

		verify(legislationService).findByKeyword(keyword);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\MediaControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.model.enums.MediaType;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.media.MediaService;

@WebMvcTest(MediaController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class MediaControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private MediaService mediaService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateMediaDTO createDTO;
	private MediaResponseDTO responseDTO;
	private final String mediaId = "media-123";
	private final String requestId = "req-456";

	@BeforeEach
	void setUp() {
		createDTO = new CreateMediaDTO();
		createDTO.setType(MediaType.IMAGE);
		createDTO.setUrl("http://example.com/image.jpg");
		createDTO.setRequestId(requestId);

		responseDTO = new MediaResponseDTO();
		responseDTO.setId(mediaId);
		responseDTO.setType(MediaType.IMAGE);
		responseDTO.setUrl("http://example.com/image.jpg");
		responseDTO.setUploadedAt(LocalDateTime.now());
		responseDTO.setRequestId(requestId);
	}

	@Test
	void shouldCreateMedia() throws Exception {
		when(mediaService.create(any(CreateMediaDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/media").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value(mediaId))
				.andExpect(jsonPath("$.type").value("IMAGE"))
				.andExpect(jsonPath("$.url").value("http://example.com/image.jpg"))
				.andExpect(jsonPath("$.requestId").value(requestId));

		verify(mediaService).create(any(CreateMediaDTO.class));
	}

	@Test
	void shouldFindAllMedia() throws Exception {
		when(mediaService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/media")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(mediaId)).andExpect(jsonPath("$[0].type").value("IMAGE"))
				.andExpect(jsonPath("$[0].url").value("http://example.com/image.jpg"))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(mediaService).findAll();
	}

	@Test
	void shouldFindMediaById() throws Exception {
		when(mediaService.findById(mediaId)).thenReturn(responseDTO);

		mockMvc.perform(get("/media/{id}", mediaId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(mediaId)).andExpect(jsonPath("$.type").value("IMAGE"))
				.andExpect(jsonPath("$.url").value("http://example.com/image.jpg"))
				.andExpect(jsonPath("$.requestId").value(requestId));

		verify(mediaService).findById(mediaId);
	}

	@Test
	void shouldFindMediaByRequest() throws Exception {
		when(mediaService.findByRequest(requestId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/media/request/{requestId}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(mediaId))
				.andExpect(jsonPath("$[0].type").value("IMAGE"))
				.andExpect(jsonPath("$[0].url").value("http://example.com/image.jpg"))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(mediaService).findByRequest(requestId);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\RequestControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestStatusDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.request.RequestService;

@WebMvcTest(RequestController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class RequestControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private RequestService requestService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateRequestDTO createDTO;
	private UpdateRequestDTO updateDTO;
	private UpdateRequestStatusDTO updateStatusDTO;
	private RequestResponseDTO responseDTO;
	private RequestStatisticsDTO statisticsDTO;
	private CategoryStatisticsDTO categoryStatisticsDTO;
	private SubCategoryStatisticsDTO subCategoryStatisticsDTO;
	private final String requestId = "req-123";
	private final String userId = "user-456";
	private final String categoryId = "cat-789";
	private final String subCategoryId = "sub-101";
	private final String departmentId = "dep-112";

	@BeforeEach
	void setUp() {
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setCep("58700-000");
		addressDTO.setStreet("Rua da Liberdade");
		addressDTO.setNumber("42");
		addressDTO.setNeighborhood("Centro");
		addressDTO.setCity("Patos");
		addressDTO.setState("PB");
		addressDTO.setComplement("Sobrado");

		AddressResponseDTO addressResponseDTO = new AddressResponseDTO();
		addressResponseDTO.setCep("58700-000");
		addressResponseDTO.setStreet("Rua da Liberdade");
		addressResponseDTO.setNumber("42");
		addressResponseDTO.setNeighborhood("Centro");
		addressResponseDTO.setCity("Patos");
		addressResponseDTO.setState("PB");
		addressResponseDTO.setComplement("Sobrado");

		createDTO = new CreateRequestDTO();
		createDTO.setTitle("Buraco na rua");
		createDTO.setDescription("Buraco grande na Rua da Liberdade, próximo ao número 42");
		createDTO.setCategoryId(categoryId);
		createDTO.setSubCategoryId(subCategoryId);
		createDTO.setCitizenPriority(PriorityLevel.HIGH);
		createDTO.setLatitude(-7.0244);
		createDTO.setLongitude(-37.2806);
		createDTO.setAddress(addressDTO);

		updateDTO = new UpdateRequestDTO();
		updateDTO.setTitle("Buraco na rua (atualizado)");
		updateDTO.setDescription("Buraco ainda maior, precisa de reparo urgente");

		updateStatusDTO = new UpdateRequestStatusDTO();
		updateStatusDTO.setStatus(RequestStatus.IN_PROGRESS);
		updateStatusDTO.setNote("Em andamento pela equipe de obras");

		responseDTO = new RequestResponseDTO();
		responseDTO.setId(requestId);
		responseDTO.setTitle("Buraco na rua");
		responseDTO.setDescription("Buraco grande na Rua da Liberdade, próximo ao número 42");
		responseDTO.setUserId(userId);
		responseDTO.setCategoryId(categoryId);
		responseDTO.setSubCategoryId(subCategoryId);
		responseDTO.setCitizenPriority(PriorityLevel.HIGH);
		responseDTO.setStatus(RequestStatus.RECEIVED);
		responseDTO.setLatitude(-7.0244);
		responseDTO.setLongitude(-37.2806);
		responseDTO.setAddress(addressResponseDTO);
		responseDTO.setDepartmentId(departmentId);
		responseDTO.setCreatedAt(LocalDateTime.now());

		statisticsDTO = new RequestStatisticsDTO();
		statisticsDTO.setTotalRequests(10);
		statisticsDTO.setReceivedRequests(3);
		statisticsDTO.setInProgressRequests(4);
		statisticsDTO.setResolvedRequests(2);
		statisticsDTO.setCancelledRequests(1);
		statisticsDTO.setResolutionRate(20.0);

		categoryStatisticsDTO = new CategoryStatisticsDTO();
		categoryStatisticsDTO.setCategoryId(categoryId);
		categoryStatisticsDTO.setTotalRequests(5);
		categoryStatisticsDTO.setResolvedRequests(1);
		categoryStatisticsDTO.setResolutionRate(20.0);

		subCategoryStatisticsDTO = new SubCategoryStatisticsDTO();
		subCategoryStatisticsDTO.setSubCategoryId(subCategoryId);
		subCategoryStatisticsDTO.setTotalRequests(3);
		subCategoryStatisticsDTO.setResolvedRequests(0);
		subCategoryStatisticsDTO.setResolutionRate(0.0);
	}

	@Test
	void shouldCreateRequest() throws Exception {
		when(requestService.create(any(CreateRequestDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/requests").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value(requestId))
				.andExpect(jsonPath("$.title").value("Buraco na rua"))
				.andExpect(jsonPath("$.description").value("Buraco grande na Rua da Liberdade, próximo ao número 42"))
				.andExpect(jsonPath("$.userId").value(userId)).andExpect(jsonPath("$.categoryId").value(categoryId))
				.andExpect(jsonPath("$.subCategoryId").value(subCategoryId))
				.andExpect(jsonPath("$.citizenPriority").value("HIGH"))
				.andExpect(jsonPath("$.status").value("RECEIVED")).andExpect(jsonPath("$.latitude").value(-7.0244))
				.andExpect(jsonPath("$.longitude").value(-37.2806))
				.andExpect(jsonPath("$.departmentId").value(departmentId))
				.andExpect(jsonPath("$.address.cep").value("58700-000"))
				.andExpect(jsonPath("$.address.city").value("Patos"));

		verify(requestService).create(any(CreateRequestDTO.class));
	}

	@Test
	void shouldFindAllRequests() throws Exception {
		when(requestService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(requestId))
				.andExpect(jsonPath("$[0].title").value("Buraco na rua"));

		verify(requestService).findAll();
	}

	@Test
	void shouldFindRequestById() throws Exception {
		when(requestService.findById(requestId)).thenReturn(responseDTO);

		mockMvc.perform(get("/requests/{id}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(requestId)).andExpect(jsonPath("$.title").value("Buraco na rua"));

		verify(requestService).findById(requestId);
	}

	@Test
	void shouldFindRequestsByStatus() throws Exception {
		when(requestService.findByStatus(RequestStatus.RECEIVED)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests/status/{status}", RequestStatus.RECEIVED)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].status").value("RECEIVED"));

		verify(requestService).findByStatus(RequestStatus.RECEIVED);
	}

	@Test
	void shouldFindRequestsByCategory() throws Exception {
		when(requestService.findByCategory(categoryId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests/category/{categoryId}", categoryId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].categoryId").value(categoryId));

		verify(requestService).findByCategory(categoryId);
	}

	@Test
	void shouldFindRequestsBySubCategory() throws Exception {
		when(requestService.findBySubCategory(subCategoryId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests/subcategory/{subCategoryId}", subCategoryId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].subCategoryId").value(subCategoryId));

		verify(requestService).findBySubCategory(subCategoryId);
	}

	@Test
	void shouldFindRequestsByUser() throws Exception {
		when(requestService.findByUser(userId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests/user/{userId}", userId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].userId").value(userId));

		verify(requestService).findByUser(userId);
	}

	@Test
	void shouldFindRequestsByDepartment() throws Exception {
		when(requestService.findByDepartment(departmentId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/requests/department/{departmentId}", departmentId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].departmentId").value(departmentId));

		verify(requestService).findByDepartment(departmentId);
	}

	@Test
	void shouldGetStatistics() throws Exception {
		when(requestService.getStatistics()).thenReturn(statisticsDTO);

		mockMvc.perform(get("/requests/statistics")).andExpect(status().isOk())
				.andExpect(jsonPath("$.totalRequests").value(10)).andExpect(jsonPath("$.receivedRequests").value(3))
				.andExpect(jsonPath("$.inProgressRequests").value(4)).andExpect(jsonPath("$.resolvedRequests").value(2))
				.andExpect(jsonPath("$.cancelledRequests").value(1))
				.andExpect(jsonPath("$.resolutionRate").value(20.0));

		verify(requestService).getStatistics();
	}

	@Test
	void shouldGetCategoryStatistics() throws Exception {
		when(requestService.getCategoryStatistics(categoryId)).thenReturn(categoryStatisticsDTO);

		mockMvc.perform(get("/requests/statistics/category/{categoryId}", categoryId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.categoryId").value(categoryId)).andExpect(jsonPath("$.totalRequests").value(5))
				.andExpect(jsonPath("$.resolvedRequests").value(1)).andExpect(jsonPath("$.resolutionRate").value(20.0));

		verify(requestService).getCategoryStatistics(categoryId);
	}

	@Test
	void shouldGetSubCategoryStatistics() throws Exception {
		when(requestService.getSubCategoryStatistics(subCategoryId)).thenReturn(subCategoryStatisticsDTO);

		mockMvc.perform(get("/requests/statistics/subcategory/{subCategoryId}", subCategoryId))
				.andExpect(status().isOk()).andExpect(jsonPath("$.subCategoryId").value(subCategoryId))
				.andExpect(jsonPath("$.totalRequests").value(3)).andExpect(jsonPath("$.resolvedRequests").value(0))
				.andExpect(jsonPath("$.resolutionRate").value(0.0));

		verify(requestService).getSubCategoryStatistics(subCategoryId);
	}

	@Test
	void shouldSearchRequests() throws Exception {
		Page<RequestResponseDTO> page = new PageImpl<>(List.of(responseDTO), PageRequest.of(0, 10), 1);
		when(requestService.search(eq(RequestStatus.RECEIVED), eq(categoryId), eq(subCategoryId), eq(departmentId),
				eq(userId), eq(0), eq(10), eq("createdAt"), eq("desc"))).thenReturn(page);

		mockMvc.perform(get("/requests/search").param("status", RequestStatus.RECEIVED.toString())
				.param("categoryId", categoryId).param("subCategoryId", subCategoryId)
				.param("departmentId", departmentId).param("userId", userId).param("page", "0").param("size", "10")
				.param("sortBy", "createdAt").param("direction", "desc")).andExpect(status().isOk())
				.andExpect(jsonPath("$.content.size()").value(1)).andExpect(jsonPath("$.totalElements").value(1))
				.andExpect(jsonPath("$.content[0].id").value(requestId))
				.andExpect(jsonPath("$.content[0].title").value("Buraco na rua"));

		verify(requestService).search(eq(RequestStatus.RECEIVED), eq(categoryId), eq(subCategoryId), eq(departmentId),
				eq(userId), eq(0), eq(10), eq("createdAt"), eq("desc"));
	}

	@Test
	void shouldUpdateRequest() throws Exception {
		responseDTO.setTitle("Buraco na rua (atualizado)");
		responseDTO.setDescription("Buraco ainda maior, precisa de reparo urgente");

		when(requestService.update(eq(requestId), any(UpdateRequestDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(put("/requests/{id}", requestId).contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateDTO))).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(requestId))
				.andExpect(jsonPath("$.title").value("Buraco na rua (atualizado)"))
				.andExpect(jsonPath("$.description").value("Buraco ainda maior, precisa de reparo urgente"));

		verify(requestService).update(eq(requestId), any(UpdateRequestDTO.class));
	}

	@Test
	void shouldUpdateRequestStatus() throws Exception {
		responseDTO.setStatus(RequestStatus.IN_PROGRESS);

		when(requestService.updateStatus(eq(requestId), any(UpdateRequestStatusDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(patch("/requests/{id}/status", requestId).contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateStatusDTO))).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(requestId)).andExpect(jsonPath("$.status").value("IN_PROGRESS"));

		verify(requestService).updateStatus(eq(requestId), any(UpdateRequestStatusDTO.class));
	}

	@Test
	void shouldDeleteRequest() throws Exception {
		doNothing().when(requestService).delete(requestId);

		mockMvc.perform(delete("/requests/{id}", requestId)).andExpect(status().isNoContent());

		verify(requestService).delete(requestId);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\RequestHistoryControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.requesthistory.RequestHistoryService;

@WebMvcTest(RequestHistoryController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class RequestHistoryControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private RequestHistoryService requestHistoryService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private RequestHistoryResponseDTO historyDTO;
	private final String requestId = "req-123";
	private final String historyId = "hist-456";

	@BeforeEach
	void setUp() {
		historyDTO = new RequestHistoryResponseDTO();
		historyDTO.setId(historyId);
		historyDTO.setOldStatus(RequestStatus.RECEIVED);
		historyDTO.setNewStatus(RequestStatus.IN_PROGRESS);
		historyDTO.setChangedBy("Operador Patos");
		historyDTO.setNote("Iniciando atendimento");
		historyDTO.setChangedAt(LocalDateTime.now().minusHours(1));
	}

	@Test
	void shouldFindHistoryByRequest() throws Exception {
		when(requestHistoryService.findByRequest(requestId)).thenReturn(List.of(historyDTO));

		mockMvc.perform(get("/request-history/request/{requestId}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(historyId))
				.andExpect(jsonPath("$[0].oldStatus").value("RECEIVED"))
				.andExpect(jsonPath("$[0].newStatus").value("IN_PROGRESS"))
				.andExpect(jsonPath("$[0].changedBy").value("Operador Patos"))
				.andExpect(jsonPath("$[0].note").value("Iniciando atendimento"));

		verify(requestHistoryService).findByRequest(requestId);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\SubCategoryControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.subcategory.SubCategoryService;

@WebMvcTest(SubCategoryController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class SubCategoryControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private SubCategoryService subCategoryService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateSubCategoryDTO createDTO;
	private UpdateSubCategoryDTO updateDTO;
	private SubCategoryResponseDTO responseDTO;
	private final String categoryId = "cat-123";
	private final String departmentId = "dep-456";
	private final String subCategoryId = "sub-789";

	@BeforeEach
	void setUp() {
		createDTO = new CreateSubCategoryDTO();
		createDTO.setName("Infrastructure Sub");
		createDTO.setDescription("Subcategory for infrastructure");
		createDTO.setCategoryId(categoryId);
		createDTO.setDepartmentId(departmentId);

		updateDTO = new UpdateSubCategoryDTO();
		updateDTO.setName("Infrastructure Sub Updated");
		updateDTO.setDescription("Updated description");
		updateDTO.setCategoryId(categoryId);
		updateDTO.setDepartmentId(departmentId);

		responseDTO = new SubCategoryResponseDTO();
		responseDTO.setId(subCategoryId);
		responseDTO.setName("Infrastructure Sub");
		responseDTO.setDescription("Subcategory for infrastructure");
		responseDTO.setCategoryId(categoryId);
		responseDTO.setDepartmentId(departmentId);
	}

	@Test
	void shouldCreateSubCategory() throws Exception {
		when(subCategoryService.create(any(CreateSubCategoryDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(post("/subcategories").contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(createDTO))).andExpect(status().isCreated())
				.andExpect(jsonPath("$.id").value(subCategoryId))
				.andExpect(jsonPath("$.name").value("Infrastructure Sub"))
				.andExpect(jsonPath("$.description").value("Subcategory for infrastructure"))
				.andExpect(jsonPath("$.categoryId").value(categoryId))
				.andExpect(jsonPath("$.departmentId").value(departmentId));

		verify(subCategoryService).create(any(CreateSubCategoryDTO.class));
	}

	@Test
	void shouldFindAllSubCategories() throws Exception {
		when(subCategoryService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/subcategories")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(subCategoryId))
				.andExpect(jsonPath("$[0].name").value("Infrastructure Sub"))
				.andExpect(jsonPath("$[0].description").value("Subcategory for infrastructure"))
				.andExpect(jsonPath("$[0].categoryId").value(categoryId))
				.andExpect(jsonPath("$[0].departmentId").value(departmentId));

		verify(subCategoryService).findAll();
	}

	@Test
	void shouldFindSubCategoryById() throws Exception {
		when(subCategoryService.findById(subCategoryId)).thenReturn(responseDTO);

		mockMvc.perform(get("/subcategories/{id}", subCategoryId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(subCategoryId))
				.andExpect(jsonPath("$.name").value("Infrastructure Sub"))
				.andExpect(jsonPath("$.description").value("Subcategory for infrastructure"))
				.andExpect(jsonPath("$.categoryId").value(categoryId))
				.andExpect(jsonPath("$.departmentId").value(departmentId));

		verify(subCategoryService).findById(subCategoryId);
	}

	@Test
	void shouldFindSubCategoriesByCategory() throws Exception {
		when(subCategoryService.findByCategory(categoryId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/subcategories/category/{categoryId}", categoryId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(subCategoryId))
				.andExpect(jsonPath("$[0].name").value("Infrastructure Sub"))
				.andExpect(jsonPath("$[0].description").value("Subcategory for infrastructure"))
				.andExpect(jsonPath("$[0].categoryId").value(categoryId))
				.andExpect(jsonPath("$[0].departmentId").value(departmentId));

		verify(subCategoryService).findByCategory(categoryId);
	}

	@Test
	void shouldUpdateSubCategory() throws Exception {
		responseDTO.setName("Infrastructure Sub Updated");
		responseDTO.setDescription("Updated description");

		when(subCategoryService.update(eq(subCategoryId), any(UpdateSubCategoryDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(put("/subcategories/{id}", subCategoryId).contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateDTO))).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(subCategoryId))
				.andExpect(jsonPath("$.name").value("Infrastructure Sub Updated"))
				.andExpect(jsonPath("$.description").value("Updated description"))
				.andExpect(jsonPath("$.categoryId").value(categoryId))
				.andExpect(jsonPath("$.departmentId").value(departmentId));

		verify(subCategoryService).update(eq(subCategoryId), any(UpdateSubCategoryDTO.class));
	}

	@Test
	void shouldDeleteSubCategory() throws Exception {
		doNothing().when(subCategoryService).delete(subCategoryId);

		mockMvc.perform(delete("/subcategories/{id}", subCategoryId)).andExpect(status().isNoContent());

		verify(subCategoryService).delete(subCategoryId);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\UpdateControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.update.UpdateService;

@WebMvcTest(UpdateController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class UpdateControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private UpdateService updateService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateUpdateDTO createDTO;
	private UpdateResponseDTO responseDTO;
	private final String updateId = "upd-123";
	private final String requestId = "req-456";

	@BeforeEach
	void setUp() {
		createDTO = new CreateUpdateDTO();
		createDTO.setStatus(RequestStatus.IN_PROGRESS);
		createDTO.setDescription("Update description");
		createDTO.setRequestId(requestId);

		responseDTO = new UpdateResponseDTO();
		responseDTO.setId(updateId);
		responseDTO.setStatus(RequestStatus.IN_PROGRESS);
		responseDTO.setDescription("Update description");
		responseDTO.setUpdatedAt(LocalDateTime.now());
		responseDTO.setRequestId(requestId);
	}

	@Test
	void shouldCreateUpdate() throws Exception {
		when(updateService.create(any(CreateUpdateDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/updates").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value(updateId))
				.andExpect(jsonPath("$.status").value("IN_PROGRESS"))
				.andExpect(jsonPath("$.description").value("Update description"))
				.andExpect(jsonPath("$.requestId").value(requestId));

		verify(updateService).create(any(CreateUpdateDTO.class));
	}

	@Test
	void shouldFindAllUpdates() throws Exception {
		when(updateService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/updates")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(updateId)).andExpect(jsonPath("$[0].status").value("IN_PROGRESS"))
				.andExpect(jsonPath("$[0].description").value("Update description"))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(updateService).findAll();
	}

	@Test
	void shouldFindUpdatesByRequestId() throws Exception {
		when(updateService.findByRequest(requestId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/updates/request/{requestId}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(updateId))
				.andExpect(jsonPath("$[0].status").value("IN_PROGRESS"))
				.andExpect(jsonPath("$[0].description").value("Update description"))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(updateService).findByRequest(requestId);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\UserControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.hamcrest.Matchers.startsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.user.UserService;

@WebMvcTest(UserController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class UserControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private UserService userService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateUserDTO createDTO;
	private UpdateUserDTO updateDTO;
	private UserResponseDTO responseDTO;
	private final String userId = "user-123";
	private final String departmentId = "dep-456";

	@BeforeEach
	void setUp() {
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setCep("58700-000");
		addressDTO.setStreet("Rua da Liberdade");
		addressDTO.setNumber("42");
		addressDTO.setNeighborhood("Centro");
		addressDTO.setCity("Patos");
		addressDTO.setState("PB");
		addressDTO.setComplement("Sobrado");

		AddressResponseDTO addressResponseDTO = new AddressResponseDTO();
		addressResponseDTO.setCep("58700-000");
		addressResponseDTO.setStreet("Rua da Liberdade");
		addressResponseDTO.setNumber("42");
		addressResponseDTO.setNeighborhood("Centro");
		addressResponseDTO.setCity("Patos");
		addressResponseDTO.setState("PB");
		addressResponseDTO.setComplement("Sobrado");

		createDTO = new CreateUserDTO();
		createDTO.setName("Maria Patos");
		createDTO.setEmail("maria.patos@example.com");
		createDTO.setCpf("98765432100");
		createDTO.setPassword("patos123");
		createDTO.setAddress(addressDTO);

		updateDTO = new UpdateUserDTO();
		updateDTO.setName("Maria Patos Updated");
		updateDTO.setEmail("maria.patos.updated@example.com");
		updateDTO.setPassword("novoPatos123");
		updateDTO.setAddress(addressDTO);

		responseDTO = new UserResponseDTO();
		responseDTO.setId(userId);
		responseDTO.setName("Maria Patos");
		responseDTO.setEmail("maria.patos@example.com");
		responseDTO.setRole(Role.CITIZEN);
		responseDTO.setDepartmentId(null);
		responseDTO.setAddress(addressResponseDTO);
		responseDTO.setCreatedAt(LocalDateTime.now().minusDays(1));
		responseDTO.setUpdatedAt(LocalDateTime.now());
	}

	@Test
	void shouldCreateUser() throws Exception {
		when(userService.create(any(CreateUserDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/users").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(header().exists("Location"))
				.andExpect(header().string("Location", startsWith("http://localhost/users/")))
				.andExpect(jsonPath("$.id").value(userId)).andExpect(jsonPath("$.name").value("Maria Patos"))
				.andExpect(jsonPath("$.email").value("maria.patos@example.com"))
				.andExpect(jsonPath("$.role").value("CITIZEN")).andExpect(jsonPath("$.address.cep").value("58700-000"))
				.andExpect(jsonPath("$.address.street").value("Rua da Liberdade"))
				.andExpect(jsonPath("$.address.number").value("42"))
				.andExpect(jsonPath("$.address.neighborhood").value("Centro"))
				.andExpect(jsonPath("$.address.city").value("Patos")).andExpect(jsonPath("$.address.state").value("PB"))
				.andExpect(jsonPath("$.address.complement").value("Sobrado"));

		verify(userService).create(any(CreateUserDTO.class));
	}

	@Test
	void shouldFindAllUsers() throws Exception {
		when(userService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/users")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(userId)).andExpect(jsonPath("$[0].name").value("Maria Patos"))
				.andExpect(jsonPath("$[0].email").value("maria.patos@example.com"))
				.andExpect(jsonPath("$[0].role").value("CITIZEN"))
				.andExpect(jsonPath("$[0].address.cep").value("58700-000"));

		verify(userService).findAll();
	}

	@Test
	void shouldFindUserById() throws Exception {
		when(userService.findById(userId)).thenReturn(responseDTO);

		mockMvc.perform(get("/users/{id}", userId)).andExpect(status().isOk()).andExpect(jsonPath("$.id").value(userId))
				.andExpect(jsonPath("$.name").value("Maria Patos"))
				.andExpect(jsonPath("$.email").value("maria.patos@example.com"))
				.andExpect(jsonPath("$.role").value("CITIZEN")).andExpect(jsonPath("$.address.city").value("Patos"));

		verify(userService).findById(userId);
	}

	@Test
	void shouldFindOperatorsByDepartment() throws Exception {
		UserResponseDTO operatorResponse = new UserResponseDTO();
		operatorResponse.setId("op-123");
		operatorResponse.setName("Operador Patos");
		operatorResponse.setEmail("operador.patos@example.com");
		operatorResponse.setRole(Role.OPERATOR);
		operatorResponse.setDepartmentId(departmentId);
		operatorResponse.setAddress(null);
		operatorResponse.setCreatedAt(LocalDateTime.now());
		operatorResponse.setUpdatedAt(LocalDateTime.now());

		when(userService.findOperatorsByDepartment(departmentId)).thenReturn(List.of(operatorResponse));

		mockMvc.perform(get("/users/operators/department/{departmentId}", departmentId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value("op-123"))
				.andExpect(jsonPath("$[0].name").value("Operador Patos"))
				.andExpect(jsonPath("$[0].role").value("OPERATOR"))
				.andExpect(jsonPath("$[0].departmentId").value(departmentId));

		verify(userService).findOperatorsByDepartment(departmentId);
	}

	@Test
	void shouldUpdateUser() throws Exception {
		responseDTO.setName("Maria Patos Updated");
		responseDTO.setEmail("maria.patos.updated@example.com");

		when(userService.update(eq(userId), any(UpdateUserDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(put("/users/{id}", userId).contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateDTO))).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(userId)).andExpect(jsonPath("$.name").value("Maria Patos Updated"))
				.andExpect(jsonPath("$.email").value("maria.patos.updated@example.com"))
				.andExpect(jsonPath("$.role").value("CITIZEN")).andExpect(jsonPath("$.address.cep").value("58700-000"));

		verify(userService).update(eq(userId), any(UpdateUserDTO.class));
	}

	@Test
	void shouldDeleteUser() throws Exception {
		doNothing().when(userService).delete(userId);

		mockMvc.perform(delete("/users/{id}", userId)).andExpect(status().isNoContent());

		verify(userService).delete(userId);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\controller\VoteControllerTest.java

```java
package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.vote.VoteService;

@WebMvcTest(VoteController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class VoteControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private VoteService voteService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateVoteDTO createDTO;
	private VoteResponseDTO voteResponseDTO;
	private RequestPriorityDTO priorityDTO;
	private final String voteId = "vote-123";
	private final String requestId = "req-456";
	private final String userId = "user-789";

	@BeforeEach
	void setUp() {
		createDTO = new CreateVoteDTO();
		createDTO.setRequestId(requestId);
		createDTO.setPriorityLevel(PriorityLevel.HIGH);

		voteResponseDTO = new VoteResponseDTO();
		voteResponseDTO.setId(voteId);
		voteResponseDTO.setUserId(userId);
		voteResponseDTO.setRequestId(requestId);
		voteResponseDTO.setPriorityLevel(PriorityLevel.HIGH);
		voteResponseDTO.setCreatedAt(LocalDateTime.now());

		priorityDTO = new RequestPriorityDTO();
		priorityDTO.setLowVotes(1);
		priorityDTO.setMediumVotes(2);
		priorityDTO.setHighVotes(3);
		priorityDTO.setTotalVotes(6);
		priorityDTO.setLowPercentage(16.67);
		priorityDTO.setMediumPercentage(33.33);
		priorityDTO.setHighPercentage(50.0);
	}

	@Test
	void shouldCreateVote() throws Exception {
		when(voteService.create(any(CreateVoteDTO.class))).thenReturn(voteResponseDTO);

		mockMvc.perform(
				post("/votes").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value(voteId))
				.andExpect(jsonPath("$.userId").value(userId)).andExpect(jsonPath("$.requestId").value(requestId))
				.andExpect(jsonPath("$.priorityLevel").value("HIGH"));

		verify(voteService).create(any(CreateVoteDTO.class));
	}

	@Test
	void shouldFindAllVotes() throws Exception {
		when(voteService.findAll()).thenReturn(List.of(voteResponseDTO));

		mockMvc.perform(get("/votes")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(voteId)).andExpect(jsonPath("$[0].userId").value(userId))
				.andExpect(jsonPath("$[0].requestId").value(requestId))
				.andExpect(jsonPath("$[0].priorityLevel").value("HIGH"));

		verify(voteService).findAll();
	}

	@Test
	void shouldFindVotesByRequest() throws Exception {
		when(voteService.findByRequest(requestId)).thenReturn(List.of(voteResponseDTO));

		mockMvc.perform(get("/votes/request/{requestId}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(voteId))
				.andExpect(jsonPath("$[0].userId").value(userId)).andExpect(jsonPath("$[0].requestId").value(requestId))
				.andExpect(jsonPath("$[0].priorityLevel").value("HIGH"));

		verify(voteService).findByRequest(requestId);
	}

	@Test
	void shouldGetRequestPriority() throws Exception {
		when(voteService.getRequestPriority(requestId)).thenReturn(priorityDTO);

		mockMvc.perform(get("/votes/request/{requestId}/priority", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.lowVotes").value(1)).andExpect(jsonPath("$.mediumVotes").value(2))
				.andExpect(jsonPath("$.highVotes").value(3)).andExpect(jsonPath("$.totalVotes").value(6))
				.andExpect(jsonPath("$.lowPercentage").value(16.67))
				.andExpect(jsonPath("$.mediumPercentage").value(33.33))
				.andExpect(jsonPath("$.highPercentage").value(50.0));

		verify(voteService).getRequestPriority(requestId);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\AddressMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.Address;

class AddressMapperTest {

	private AddressMapper addressMapper;

	@BeforeEach
	void setUp() {
		addressMapper = new AddressMapper();
	}

	@Test
	void toEntity_shouldReturnNullWhenDtoIsNull() {
		Address result = addressMapper.toEntity(null);
		assertNull(result);
	}

	@Test
	void toEntity_shouldMapAllFieldsCorrectly() {
		AddressDTO dto = new AddressDTO();
		dto.setCep("58700-000");
		dto.setStreet("Rua da Liberdade");
		dto.setNumber("42");
		dto.setNeighborhood("Centro");
		dto.setCity("Patos");
		dto.setState("PB");
		dto.setComplement("Sobrado");

		Address result = addressMapper.toEntity(dto);

		assertEquals(dto.getCep(), result.getCep());
		assertEquals(dto.getStreet(), result.getStreet());
		assertEquals(dto.getNumber(), result.getNumber());
		assertEquals(dto.getNeighborhood(), result.getNeighborhood());
		assertEquals(dto.getCity(), result.getCity());
		assertEquals(dto.getState(), result.getState());
		assertEquals(dto.getComplement(), result.getComplement());
	}

	@Test
	void toResponse_shouldReturnNullWhenAddressIsNull() {
		AddressResponseDTO result = addressMapper.toResponse(null);
		assertNull(result);
	}

	@Test
	void toResponse_shouldMapAllFieldsCorrectly() {
		Address address = new Address();
		address.setCep("58700-000");
		address.setStreet("Rua da Liberdade");
		address.setNumber("42");
		address.setNeighborhood("Centro");
		address.setCity("Patos");
		address.setState("PB");
		address.setComplement("Sobrado");

		AddressResponseDTO result = addressMapper.toResponse(address);

		assertEquals(address.getCep(), result.getCep());
		assertEquals(address.getStreet(), result.getStreet());
		assertEquals(address.getNumber(), result.getNumber());
		assertEquals(address.getNeighborhood(), result.getNeighborhood());
		assertEquals(address.getCity(), result.getCity());
		assertEquals(address.getState(), result.getState());
		assertEquals(address.getComplement(), result.getComplement());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\CategoryMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.model.Category;

class CategoryMapperTest {

	private CategoryMapper categoryMapper;

	@BeforeEach
	void setUp() {
		categoryMapper = new CategoryMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateCategoryDTO dto = new CreateCategoryDTO();
		dto.setName("Infraestrutura");
		dto.setDescription("Categoria de infraestrutura urbana");
		dto.setDepartmentId("dep-1");

		Category entity = categoryMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getDescription(), entity.getDescription());
		assertEquals(dto.getDepartmentId(), entity.getDepartmentId());
	}

	@Test
	void updateEntity_shouldUpdateEntityFromDto() {
		Category category = new Category();
		category.setName("Antigo");
		category.setDescription("Antiga descrição");
		category.setDepartmentId("dep-antigo");

		UpdateCategoryDTO dto = new UpdateCategoryDTO();
		dto.setName("Infraestrutura");
		dto.setDescription("Categoria de infraestrutura urbana");
		dto.setDepartmentId("dep-1");

		categoryMapper.updateEntity(category, dto);

		assertEquals(dto.getName(), category.getName());
		assertEquals(dto.getDescription(), category.getDescription());
		assertEquals(dto.getDepartmentId(), category.getDepartmentId());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Category category = new Category();
		category.setId("cat-1");
		category.setName("Infraestrutura");
		category.setDescription("Categoria de infraestrutura urbana");
		category.setDepartmentId("dep-1");

		CategoryResponseDTO dto = categoryMapper.toResponse(category);

		assertNotNull(dto);
		assertEquals(category.getId(), dto.getId());
		assertEquals(category.getName(), dto.getName());
		assertEquals(category.getDescription(), dto.getDescription());
		assertEquals(category.getDepartmentId(), dto.getDepartmentId());
	}

	@Test
	void toResponse_shouldReturnNullWhenCategoryIsNull() {
		CategoryResponseDTO dto = categoryMapper.toResponse(null);
		assertNull(dto);
	}

	@Test
	void toStatisticsResponse_shouldMapAllFields() {
		String categoryId = "cat-1";
		String categoryName = "Infraestrutura";
		Integer totalRequests = 100;
		Integer receivedRequests = 20;
		Integer inProgressRequests = 30;
		Integer resolvedRequests = 40;
		Integer cancelledRequests = 10;
		Double resolutionRate = 40.0;

		CategoryStatisticsDTO dto = categoryMapper.toStatisticsResponse(categoryId, categoryName, totalRequests,
				receivedRequests, inProgressRequests, resolvedRequests, cancelledRequests, resolutionRate);

		assertNotNull(dto);
		assertEquals(categoryId, dto.getCategoryId());
		assertEquals(categoryName, dto.getCategoryName());
		assertEquals(totalRequests, dto.getTotalRequests());
		assertEquals(receivedRequests, dto.getReceivedRequests());
		assertEquals(inProgressRequests, dto.getInProgressRequests());
		assertEquals(resolvedRequests, dto.getResolvedRequests());
		assertEquals(cancelledRequests, dto.getCancelledRequests());
		assertEquals(resolutionRate, dto.getResolutionRate());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\DashboardMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;

class DashboardMapperTest {

	private DashboardMapper dashboardMapper;

	@BeforeEach
	void setUp() {
		dashboardMapper = new DashboardMapper();
	}

	@Test
	void toStatisticsResponse_shouldMapAllFields() {
		Integer totalRequests = 100;
		Integer receivedRequests = 20;
		Integer inProgressRequests = 30;
		Integer resolvedRequests = 40;
		Integer cancelledRequests = 10;
		Double resolutionRate = 40.0;
		Integer totalUsers = 50;
		Integer totalVotes = 60;
		Integer totalFeedbacks = 25;
		Double averageRating = 4.2;

		DashboardStatisticsDTO dto = dashboardMapper.toStatisticsResponse(totalRequests, receivedRequests,
				inProgressRequests, resolvedRequests, cancelledRequests, resolutionRate, totalUsers, totalVotes,
				totalFeedbacks, averageRating);

		assertNotNull(dto);
		assertEquals(totalRequests, dto.getTotalRequests());
		assertEquals(receivedRequests, dto.getReceivedRequests());
		assertEquals(inProgressRequests, dto.getInProgressRequests());
		assertEquals(resolvedRequests, dto.getResolvedRequests());
		assertEquals(cancelledRequests, dto.getCancelledRequests());
		assertEquals(resolutionRate, dto.getResolutionRate());
		assertEquals(totalUsers, dto.getTotalUsers());
		assertEquals(totalVotes, dto.getTotalVotes());
		assertEquals(totalFeedbacks, dto.getTotalFeedbacks());
		assertEquals(averageRating, dto.getAverageRating());
	}

	@Test
	void toOverviewResponse_shouldMapAllFields() {
		Long totalRequests = 100L;
		Long receivedRequests = 20L;
		Long underReviewRequests = 5L;
		Long approvedRequests = 8L;
		Long inProgressRequests = 30L;
		Long resolvedRequests = 40L;
		Long cancelledRequests = 10L;
		Long rejectedRequests = 3L;
		Long totalUsers = 50L;
		Long totalVotes = 60L;
		Double averageRating = 4.2;

		DashboardOverviewDTO dto = dashboardMapper.toOverviewResponse(totalRequests, receivedRequests,
				underReviewRequests, approvedRequests, inProgressRequests, resolvedRequests, cancelledRequests,
				rejectedRequests, totalUsers, totalVotes, averageRating);

		assertNotNull(dto);
		assertEquals(totalRequests, dto.getTotalRequests());
		assertEquals(receivedRequests, dto.getReceivedRequests());
		assertEquals(underReviewRequests, dto.getUnderReviewRequests());
		assertEquals(approvedRequests, dto.getApprovedRequests());
		assertEquals(inProgressRequests, dto.getInProgressRequests());
		assertEquals(resolvedRequests, dto.getResolvedRequests());
		assertEquals(cancelledRequests, dto.getCancelledRequests());
		assertEquals(rejectedRequests, dto.getRejectedRequests());
		assertEquals(totalUsers, dto.getTotalUsers());
		assertEquals(totalVotes, dto.getTotalVotes());
		assertEquals(averageRating, dto.getAverageRating());
	}

	@Test
	void toTopCategoryResponse_shouldMapAllFields() {
		String categoryId = "cat-1";
		String categoryName = "Infraestrutura";
		Integer totalRequests = 50;

		TopCategoryDTO dto = dashboardMapper.toTopCategoryResponse(categoryId, categoryName, totalRequests);

		assertNotNull(dto);
		assertEquals(categoryId, dto.getCategoryId());
		assertEquals(categoryName, dto.getCategoryName());
		assertEquals(totalRequests, dto.getTotalRequests());
	}

	@Test
	void toTopSubCategoryResponse_shouldMapAllFields() {
		String subCategoryId = "sub-1";
		String subCategoryName = "Pavimentação";
		Integer totalRequests = 25;

		TopSubCategoryDTO dto = dashboardMapper.toTopSubCategoryResponse(subCategoryId, subCategoryName, totalRequests);

		assertNotNull(dto);
		assertEquals(subCategoryId, dto.getSubCategoryId());
		assertEquals(subCategoryName, dto.getSubCategoryName());
		assertEquals(totalRequests, dto.getTotalRequests());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\DepartmentMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.model.Department;

class DepartmentMapperTest {

	private DepartmentMapper departmentMapper;

	@BeforeEach
	void setUp() {
		departmentMapper = new DepartmentMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateDepartmentDTO dto = new CreateDepartmentDTO();
		dto.setName("Infraestrutura");
		dto.setDescription("Departamento de infraestrutura urbana");

		Department entity = departmentMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getDescription(), entity.getDescription());
	}

	@Test
	void updateEntity_shouldUpdateEntityFromDto() {
		Department department = new Department();
		department.setName("Antigo");
		department.setDescription("Antiga descrição");

		UpdateDepartmentDTO dto = new UpdateDepartmentDTO();
		dto.setName("Infraestrutura");
		dto.setDescription("Departamento de infraestrutura urbana");

		departmentMapper.updateEntity(department, dto);

		assertEquals(dto.getName(), department.getName());
		assertEquals(dto.getDescription(), department.getDescription());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Department department = new Department();
		department.setId("dep-1");
		department.setName("Infraestrutura");
		department.setDescription("Departamento de infraestrutura urbana");
		department.setCreatedAt(LocalDateTime.now());
		department.setUpdatedAt(LocalDateTime.now());

		DepartmentResponseDTO dto = departmentMapper.toResponse(department);

		assertNotNull(dto);
		assertEquals(department.getId(), dto.getId());
		assertEquals(department.getName(), dto.getName());
		assertEquals(department.getDescription(), dto.getDescription());
		assertEquals(department.getCreatedAt(), dto.getCreatedAt());
		assertEquals(department.getUpdatedAt(), dto.getUpdatedAt());
	}

	@Test
	void toResponse_shouldReturnNullWhenDepartmentIsNull() {
		DepartmentResponseDTO dto = departmentMapper.toResponse(null);
		assertNull(dto);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\FeedbackMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.model.Feedback;

class FeedbackMapperTest {

	private FeedbackMapper feedbackMapper;

	@BeforeEach
	void setUp() {
		feedbackMapper = new FeedbackMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateFeedbackDTO dto = new CreateFeedbackDTO();
		dto.setRating(5);
		dto.setComment("Ótimo serviço");
		dto.setRequestId("req-123");

		Feedback entity = feedbackMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getRating(), entity.getRating());
		assertEquals(dto.getComment(), entity.getComment());
		assertEquals(dto.getRequestId(), entity.getRequestId());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Feedback feedback = new Feedback();
		feedback.setId("fb-1");
		feedback.setRating(5);
		feedback.setComment("Ótimo serviço");
		feedback.setCreatedAt(LocalDateTime.now());
		feedback.setUserId("user-123");
		feedback.setRequestId("req-123");

		FeedbackResponseDTO dto = feedbackMapper.toResponse(feedback);

		assertNotNull(dto);
		assertEquals(feedback.getId(), dto.getId());
		assertEquals(feedback.getRating(), dto.getRating());
		assertEquals(feedback.getComment(), dto.getComment());
		assertEquals(feedback.getCreatedAt(), dto.getCreatedAt());
		assertEquals(feedback.getUserId(), dto.getUserId());
		assertEquals(feedback.getRequestId(), dto.getRequestId());
	}

	@Test
	void toResponse_shouldReturnNullWhenFeedbackIsNull() {
		FeedbackResponseDTO dto = feedbackMapper.toResponse(null);
		assertNull(dto);
	}

	@Test
	void toStatisticsResponse_shouldMapAllFields() {
		Double averageRating = 4.5;
		Integer totalFeedbacks = 10;
		Integer fiveStars = 5;
		Integer fourStars = 3;
		Integer threeStars = 1;
		Integer twoStars = 1;
		Integer oneStar = 0;
		Double satisfactionPercentage = 80.0;

		FeedbackStatisticsDTO dto = feedbackMapper.toStatisticsResponse(averageRating, totalFeedbacks, fiveStars,
				fourStars, threeStars, twoStars, oneStar, satisfactionPercentage);

		assertNotNull(dto);
		assertEquals(averageRating, dto.getAverageRating());
		assertEquals(totalFeedbacks, dto.getTotalFeedbacks());
		assertEquals(fiveStars, dto.getFiveStars());
		assertEquals(fourStars, dto.getFourStars());
		assertEquals(threeStars, dto.getThreeStars());
		assertEquals(twoStars, dto.getTwoStars());
		assertEquals(oneStar, dto.getOneStar());
		assertEquals(satisfactionPercentage, dto.getSatisfactionPercentage());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\LegislationMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.model.Legislation;

class LegislationMapperTest {

	private LegislationMapper legislationMapper;

	@BeforeEach
	void setUp() {
		legislationMapper = new LegislationMapper();
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Legislation legislation = new Legislation();
		legislation.setId("leg-1");
		legislation.setTitle("Lei de Mobilidade Urbana");
		legislation.setDescription("Regulamenta a mobilidade urbana");
		legislation.setDocumentUrl("http://example.com/doc.pdf");
		List<String> keywords = Arrays.asList("mobilidade", "transporte", "urbano");
		legislation.setKeywords(keywords);

		LegislationResponseDTO dto = legislationMapper.toResponse(legislation);

		assertNotNull(dto);
		assertEquals(legislation.getId(), dto.getId());
		assertEquals(legislation.getTitle(), dto.getTitle());
		assertEquals(legislation.getDescription(), dto.getDescription());
		assertEquals(legislation.getDocumentUrl(), dto.getDocumentUrl());
		assertEquals(legislation.getKeywords(), dto.getKeywords());
	}

	@Test
	void toResponse_shouldReturnNullWhenLegislationIsNull() {
		LegislationResponseDTO dto = legislationMapper.toResponse(null);
		assertNull(dto);
	}

	@Test
	void toResponse_shouldHandleNullKeywords() {
		Legislation legislation = new Legislation();
		legislation.setId("leg-1");
		legislation.setTitle("Lei de Mobilidade Urbana");
		legislation.setDescription("Regulamenta a mobilidade urbana");
		legislation.setDocumentUrl("http://example.com/doc.pdf");
		legislation.setKeywords(null);

		LegislationResponseDTO dto = legislationMapper.toResponse(legislation);

		assertNotNull(dto);
		assertEquals(legislation.getId(), dto.getId());
		assertEquals(legislation.getTitle(), dto.getTitle());
		assertEquals(legislation.getDescription(), dto.getDescription());
		assertEquals(legislation.getDocumentUrl(), dto.getDocumentUrl());
		assertNull(dto.getKeywords());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\MediaMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.model.enums.MediaType;

class MediaMapperTest {

	private MediaMapper mediaMapper;

	@BeforeEach
	void setUp() {
		mediaMapper = new MediaMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateMediaDTO dto = new CreateMediaDTO();
		dto.setType(MediaType.IMAGE);
		dto.setUrl("http://example.com/image.jpg");
		dto.setRequestId("req-123");

		Media entity = mediaMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getType(), entity.getType());
		assertEquals(dto.getUrl(), entity.getUrl());
		assertEquals(dto.getRequestId(), entity.getRequestId());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Media media = new Media();
		media.setId("med-1");
		media.setType(MediaType.IMAGE);
		media.setUrl("http://example.com/image.jpg");
		media.setUploadedAt(LocalDateTime.now());
		media.setRequestId("req-123");

		MediaResponseDTO dto = mediaMapper.toResponse(media);

		assertNotNull(dto);
		assertEquals(media.getId(), dto.getId());
		assertEquals(media.getType(), dto.getType());
		assertEquals(media.getUrl(), dto.getUrl());
		assertEquals(media.getUploadedAt(), dto.getUploadedAt());
		assertEquals(media.getRequestId(), dto.getRequestId());
	}

	@Test
	void toResponse_shouldReturnNullWhenMediaIsNull() {
		MediaResponseDTO dto = mediaMapper.toResponse(null);
		assertNull(dto);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\RequestHistoryMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.model.RequestHistory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

class RequestHistoryMapperTest {

    private RequestHistoryMapper requestHistoryMapper;

    @BeforeEach
    void setUp() {
        requestHistoryMapper = new RequestHistoryMapper();
    }

    @Test
    void toResponse_shouldMapEntityToResponseDto() {
        RequestHistory history = new RequestHistory();
        history.setId("hist-1");
        history.setOldStatus(RequestStatus.RECEIVED);
        history.setNewStatus(RequestStatus.IN_PROGRESS);
        history.setChangedBy("Operador Teste");
        history.setNote("Iniciando atendimento");
        history.setChangedAt(LocalDateTime.now());

        RequestHistoryResponseDTO dto = requestHistoryMapper.toResponse(history);

        assertNotNull(dto);
        assertEquals(history.getId(), dto.getId());
        assertEquals(history.getOldStatus(), dto.getOldStatus());
        assertEquals(history.getNewStatus(), dto.getNewStatus());
        assertEquals(history.getChangedBy(), dto.getChangedBy());
        assertEquals(history.getNote(), dto.getNote());
        assertEquals(history.getChangedAt(), dto.getChangedAt());
    }

    @Test
    void toResponse_shouldReturnNullWhenHistoryIsNull() {
        RequestHistoryResponseDTO dto = requestHistoryMapper.toResponse(null);
        assertNull(dto);
    }
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\RequestMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestDetailsDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.model.Address;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@ExtendWith(MockitoExtension.class)
class RequestMapperTest {

	@Mock
	private AddressMapper addressMapper;

	@InjectMocks
	private RequestMapper requestMapper;

	private CreateRequestDTO createDTO;
	private UpdateRequestDTO updateDTO;
	private Request request;
	private Address address;
	private AddressDTO addressDTO;
	private AddressResponseDTO addressResponseDTO;

	@BeforeEach
	void setUp() {
		addressDTO = new AddressDTO();
		addressDTO.setCep("01000-000");
		addressDTO.setStreet("Rua Exemplo");
		addressDTO.setNumber("123");
		addressDTO.setNeighborhood("Centro");
		addressDTO.setCity("São Paulo");
		addressDTO.setState("SP");

		addressResponseDTO = new AddressResponseDTO();
		addressResponseDTO.setCep("01000-000");
		addressResponseDTO.setStreet("Rua Exemplo");
		addressResponseDTO.setNumber("123");
		addressResponseDTO.setNeighborhood("Centro");
		addressResponseDTO.setCity("São Paulo");
		addressResponseDTO.setState("SP");

		address = new Address();
		address.setCep("01000-000");
		address.setStreet("Rua Exemplo");
		address.setNumber("123");
		address.setNeighborhood("Centro");
		address.setCity("São Paulo");
		address.setState("SP");

		createDTO = new CreateRequestDTO();
		createDTO.setTitle("Problema na iluminação");
		createDTO.setDescription("Poste queimado na rua");
		createDTO.setCategoryId("cat-1");
		createDTO.setSubCategoryId("sub-1");
		createDTO.setCitizenPriority(PriorityLevel.HIGH);
		createDTO.setLatitude(-23.5505);
		createDTO.setLongitude(-46.6333);
		createDTO.setAddress(addressDTO);

		updateDTO = new UpdateRequestDTO();
		updateDTO.setTitle("Problema na iluminação atualizado");
		updateDTO.setDescription("Poste queimado e fios soltos");

		request = new Request();
		request.setId("req-123");
		request.setTitle("Problema na iluminação");
		request.setDescription("Poste queimado na rua");
		request.setUserId("user-456");
		request.setCategoryId("cat-1");
		request.setSubCategoryId("sub-1");
		request.setCitizenPriority(PriorityLevel.HIGH);
		request.setStatus(RequestStatus.RECEIVED);
		request.setLatitude(-23.5505);
		request.setLongitude(-46.6333);
		request.setAddress(address);
		request.setDepartmentId("dep-789");
		request.setCreatedAt(LocalDateTime.now());
		request.setLegislationIds(List.of("leg-1", "leg-2"));
	}

	@Test
	void toEntity_shouldMapAllFields() {
		when(addressMapper.toEntity(addressDTO)).thenReturn(address);

		Request result = requestMapper.toEntity(createDTO);

		assertEquals(createDTO.getTitle(), result.getTitle());
		assertEquals(createDTO.getDescription(), result.getDescription());
		assertEquals(createDTO.getCategoryId(), result.getCategoryId());
		assertEquals(createDTO.getSubCategoryId(), result.getSubCategoryId());
		assertEquals(createDTO.getCitizenPriority(), result.getCitizenPriority());
		assertEquals(createDTO.getLatitude(), result.getLatitude());
		assertEquals(createDTO.getLongitude(), result.getLongitude());
		assertEquals(address, result.getAddress());
	}

	@Test
	void updateEntity_shouldUpdateOnlyTitleAndDescription() {
		requestMapper.updateEntity(request, updateDTO);

		assertEquals(updateDTO.getTitle(), request.getTitle());
		assertEquals(updateDTO.getDescription(), request.getDescription());
		assertEquals("cat-1", request.getCategoryId());
		assertEquals(PriorityLevel.HIGH, request.getCitizenPriority());
	}

	@Test
	void toResponse_shouldMapAllFieldsIncludingAddress() {
		when(addressMapper.toResponse(address)).thenReturn(addressResponseDTO);

		RequestResponseDTO result = requestMapper.toResponse(request);

		assertEquals(request.getId(), result.getId());
		assertEquals(request.getTitle(), result.getTitle());
		assertEquals(request.getDescription(), result.getDescription());
		assertEquals(request.getUserId(), result.getUserId());
		assertEquals(request.getCategoryId(), result.getCategoryId());
		assertEquals(request.getSubCategoryId(), result.getSubCategoryId());
		assertEquals(request.getCitizenPriority(), result.getCitizenPriority());
		assertEquals(request.getStatus(), result.getStatus());
		assertEquals(request.getLatitude(), result.getLatitude());
		assertEquals(request.getLongitude(), result.getLongitude());
		assertEquals(request.getDepartmentId(), result.getDepartmentId());
		assertEquals(request.getCreatedAt(), result.getCreatedAt());
		assertEquals(addressResponseDTO, result.getAddress());
	}

	@Test
	void toResponse_shouldHandleNullAddress() {
		request.setAddress(null);

		RequestResponseDTO result = requestMapper.toResponse(request);

		assertNull(result.getAddress());
	}

	@Test
	void toDetailsResponse_shouldMapAllFields() {
		when(addressMapper.toResponse(address)).thenReturn(addressResponseDTO);

		RequestDetailsDTO result = requestMapper.toDetailsResponse(request);

		assertEquals(request.getId(), result.getId());
		assertEquals(request.getTitle(), result.getTitle());
		assertEquals(request.getDescription(), result.getDescription());
		assertEquals(request.getStatus(), result.getStatus());
		assertEquals(request.getCitizenPriority(), result.getCitizenPriority());
		assertEquals(request.getLatitude(), result.getLatitude());
		assertEquals(request.getLongitude(), result.getLongitude());
		assertEquals(request.getCreatedAt(), result.getCreatedAt());
		assertEquals(request.getCategoryId(), result.getCategoryId());
		assertEquals(request.getSubCategoryId(), result.getSubCategoryId());
		assertEquals(request.getLegislationIds(), result.getLegislationIds());
		assertEquals(addressResponseDTO, result.getAddress());
	}

	@Test
	void toDetailsResponse_shouldHandleNullAddress() {
		request.setAddress(null);

		RequestDetailsDTO result = requestMapper.toDetailsResponse(request);

		assertNull(result.getAddress());
	}

	@Test
	void toStatisticsResponse_shouldMapAllValues() {
		RequestStatisticsDTO result = requestMapper.toStatisticsResponse(100, 20, 30, 40, 10, 40.0);

		assertEquals(100, result.getTotalRequests());
		assertEquals(20, result.getReceivedRequests());
		assertEquals(30, result.getInProgressRequests());
		assertEquals(40, result.getResolvedRequests());
		assertEquals(10, result.getCancelledRequests());
		assertEquals(40.0, result.getResolutionRate());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\SubCategoryMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.model.SubCategory;

class SubCategoryMapperTest {

	private SubCategoryMapper subCategoryMapper;

	@BeforeEach
	void setUp() {
		subCategoryMapper = new SubCategoryMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateSubCategoryDTO dto = new CreateSubCategoryDTO();
		dto.setName("Pavimentação");
		dto.setDescription("Subcategoria para pavimentação");
		dto.setCategoryId("cat-1");
		dto.setDepartmentId("dep-1");

		SubCategory entity = subCategoryMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getDescription(), entity.getDescription());
		assertEquals(dto.getCategoryId(), entity.getCategoryId());
		assertEquals(dto.getDepartmentId(), entity.getDepartmentId());
	}

	@Test
	void updateEntity_shouldUpdateEntityFromDto() {
		SubCategory subCategory = new SubCategory();
		subCategory.setName("Antigo");
		subCategory.setDescription("Antiga descrição");
		subCategory.setCategoryId("cat-antigo");
		subCategory.setDepartmentId("dep-antigo");

		UpdateSubCategoryDTO dto = new UpdateSubCategoryDTO();
		dto.setName("Pavimentação");
		dto.setDescription("Subcategoria para pavimentação");
		dto.setCategoryId("cat-1");
		dto.setDepartmentId("dep-1");

		subCategoryMapper.updateEntity(subCategory, dto);

		assertEquals(dto.getName(), subCategory.getName());
		assertEquals(dto.getDescription(), subCategory.getDescription());
		assertEquals(dto.getCategoryId(), subCategory.getCategoryId());
		assertEquals(dto.getDepartmentId(), subCategory.getDepartmentId());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		SubCategory subCategory = new SubCategory();
		subCategory.setId("sub-1");
		subCategory.setName("Pavimentação");
		subCategory.setDescription("Subcategoria para pavimentação");
		subCategory.setCategoryId("cat-1");
		subCategory.setDepartmentId("dep-1");

		SubCategoryResponseDTO dto = subCategoryMapper.toResponse(subCategory);

		assertNotNull(dto);
		assertEquals(subCategory.getId(), dto.getId());
		assertEquals(subCategory.getName(), dto.getName());
		assertEquals(subCategory.getDescription(), dto.getDescription());
		assertEquals(subCategory.getCategoryId(), dto.getCategoryId());
		assertEquals(subCategory.getDepartmentId(), dto.getDepartmentId());
	}

	@Test
	void toResponse_shouldReturnNullWhenSubCategoryIsNull() {
		SubCategoryResponseDTO dto = subCategoryMapper.toResponse(null);
		assertNull(dto);
	}

	@Test
	void toStatisticsResponse_shouldMapAllFields() {
		String subCategoryId = "sub-1";
		String subCategoryName = "Pavimentação";
		Integer totalRequests = 100;
		Integer receivedRequests = 20;
		Integer inProgressRequests = 30;
		Integer resolvedRequests = 40;
		Integer cancelledRequests = 10;
		Double resolutionRate = 40.0;

		SubCategoryStatisticsDTO dto = subCategoryMapper.toStatisticsResponse(subCategoryId, subCategoryName,
				totalRequests, receivedRequests, inProgressRequests, resolvedRequests, cancelledRequests,
				resolutionRate);

		assertNotNull(dto);
		assertEquals(subCategoryId, dto.getSubCategoryId());
		assertEquals(subCategoryName, dto.getSubCategoryName());
		assertEquals(totalRequests, dto.getTotalRequests());
		assertEquals(receivedRequests, dto.getReceivedRequests());
		assertEquals(inProgressRequests, dto.getInProgressRequests());
		assertEquals(resolvedRequests, dto.getResolvedRequests());
		assertEquals(cancelledRequests, dto.getCancelledRequests());
		assertEquals(resolutionRate, dto.getResolutionRate());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\UpdateMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.model.Update;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

class UpdateMapperTest {

	private UpdateMapper updateMapper;

	@BeforeEach
	void setUp() {
		updateMapper = new UpdateMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateUpdateDTO dto = new CreateUpdateDTO();
		dto.setStatus(RequestStatus.IN_PROGRESS);
		dto.setDescription("Atualizando status");
		dto.setRequestId("req-123");

		Update entity = updateMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getStatus(), entity.getStatus());
		assertEquals(dto.getDescription(), entity.getDescription());
		assertEquals(dto.getRequestId(), entity.getRequestId());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Update update = new Update();
		update.setId("upd-1");
		update.setStatus(RequestStatus.IN_PROGRESS);
		update.setDescription("Atualizando status");
		update.setUpdatedAt(LocalDateTime.now());
		update.setRequestId("req-123");

		UpdateResponseDTO dto = updateMapper.toResponse(update);

		assertNotNull(dto);
		assertEquals(update.getId(), dto.getId());
		assertEquals(update.getStatus(), dto.getStatus());
		assertEquals(update.getDescription(), dto.getDescription());
		assertEquals(update.getUpdatedAt(), dto.getUpdatedAt());
		assertEquals(update.getRequestId(), dto.getRequestId());
	}

	@Test
	void toResponse_shouldReturnNullWhenUpdateIsNull() {
		UpdateResponseDTO dto = updateMapper.toResponse(null);
		assertNull(dto);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\UserMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.model.Address;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;

@ExtendWith(MockitoExtension.class)
class UserMapperTest {

	@Mock
	private AddressMapper addressMapper;

	@InjectMocks
	private UserMapper userMapper;

	private AddressDTO addressDTO;
	private Address address;
	private AddressResponseDTO addressResponseDTO;

	@BeforeEach
	void setUp() {
		addressDTO = new AddressDTO();
		addressDTO.setCep("01000-000");
		addressDTO.setStreet("Rua das Flores");
		addressDTO.setNumber("123");
		addressDTO.setNeighborhood("Centro");
		addressDTO.setCity("São Paulo");
		addressDTO.setState("SP");
		addressDTO.setComplement("Apto 45");

		address = new Address();
		address.setCep("01000-000");
		address.setStreet("Rua das Flores");
		address.setNumber("123");
		address.setNeighborhood("Centro");
		address.setCity("São Paulo");
		address.setState("SP");
		address.setComplement("Apto 45");

		addressResponseDTO = new AddressResponseDTO();
		addressResponseDTO.setCep("01000-000");
		addressResponseDTO.setStreet("Rua das Flores");
		addressResponseDTO.setNumber("123");
		addressResponseDTO.setNeighborhood("Centro");
		addressResponseDTO.setCity("São Paulo");
		addressResponseDTO.setState("SP");
		addressResponseDTO.setComplement("Apto 45");
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateUserDTO dto = new CreateUserDTO();
		dto.setName("João Silva");
		dto.setEmail("joao@email.com");
		dto.setCpf("12345678901");
		dto.setPassword("senha123");
		dto.setAddress(addressDTO);

		when(addressMapper.toEntity(addressDTO)).thenReturn(address);

		User entity = userMapper.toEntity(dto, "encodedPassword");

		assertNotNull(entity);
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getEmail(), entity.getEmail());
		assertEquals("encodedPassword", entity.getPassword());
		assertEquals(dto.getCpf(), entity.getCpf());
		assertNotNull(entity.getAddress());
		assertEquals(address, entity.getAddress());

		verify(addressMapper).toEntity(addressDTO);
	}

	@Test
	void toEntity_shouldHandleNullAddress() {
		CreateUserDTO dto = new CreateUserDTO();
		dto.setName("João Silva");
		dto.setEmail("joao@email.com");
		dto.setCpf("12345678901");
		dto.setPassword("senha123");
		dto.setAddress(null);

		User entity = userMapper.toEntity(dto, "encodedPassword");

		assertNotNull(entity);
		assertEquals(dto.getName(), entity.getName());
		assertNull(entity.getAddress());
	}

	@Test
	void updateEntity_shouldUpdateEntityFromDto() {
		User user = new User();
		user.setName("Antigo");
		user.setEmail("antigo@email.com");

		UpdateUserDTO dto = new UpdateUserDTO();
		dto.setName("João Silva");
		dto.setEmail("joao@email.com");
		dto.setAddress(addressDTO);

		when(addressMapper.toEntity(addressDTO)).thenReturn(address);

		userMapper.updateEntity(user, dto);

		assertEquals(dto.getName(), user.getName());
		assertEquals(dto.getEmail(), user.getEmail());
		assertNotNull(user.getAddress());
		assertEquals(address, user.getAddress());

		verify(addressMapper).toEntity(addressDTO);
	}

	@Test
	void updateEntity_shouldHandleNullAddress() {
		User user = new User();
		user.setName("Antigo");
		user.setEmail("antigo@email.com");

		UpdateUserDTO dto = new UpdateUserDTO();
		dto.setName("João Silva");
		dto.setEmail("joao@email.com");
		dto.setAddress(null);

		userMapper.updateEntity(user, dto);

		assertEquals(dto.getName(), user.getName());
		assertEquals(dto.getEmail(), user.getEmail());
		assertNull(user.getAddress());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		User user = new User();
		user.setId("user-1");
		user.setName("João Silva");
		user.setEmail("joao@email.com");
		user.setRole(Role.CITIZEN);
		user.setDepartmentId("dep-1");
		user.setAddress(address);

		when(addressMapper.toResponse(address)).thenReturn(addressResponseDTO);

		UserResponseDTO dto = userMapper.toResponse(user);

		assertNotNull(dto);
		assertEquals(user.getId(), dto.getId());
		assertEquals(user.getName(), dto.getName());
		assertEquals(user.getEmail(), dto.getEmail());
		assertEquals(user.getRole(), dto.getRole());
		assertEquals(user.getDepartmentId(), dto.getDepartmentId());
		assertNotNull(dto.getAddress());
		assertEquals(addressResponseDTO, dto.getAddress());

		verify(addressMapper).toResponse(address);
	}

	@Test
	void toResponse_shouldHandleNullAddress() {
		User user = new User();
		user.setId("user-1");
		user.setName("João Silva");
		user.setEmail("joao@email.com");
		user.setRole(Role.CITIZEN);
		user.setDepartmentId("dep-1");
		user.setAddress(null);

		UserResponseDTO dto = userMapper.toResponse(user);

		assertNotNull(dto);
		assertEquals(user.getId(), dto.getId());
		assertNull(dto.getAddress());
	}

	@Test
	void toResponse_shouldReturnNullWhenUserIsNull() {
		UserResponseDTO dto = userMapper.toResponse(null);
		assertNull(dto);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\mapper\VoteMapperTest.java

```java
package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

class VoteMapperTest {

	private VoteMapper voteMapper;

	@BeforeEach
	void setUp() {
		voteMapper = new VoteMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoAndUserIdToEntity() {
		CreateVoteDTO dto = new CreateVoteDTO();
		dto.setRequestId("req-123");
		dto.setPriorityLevel(PriorityLevel.HIGH);

		String userId = "user-456";

		Vote entity = voteMapper.toEntity(dto, userId);

		assertNotNull(entity);
		assertEquals(userId, entity.getUserId());
		assertEquals(dto.getRequestId(), entity.getRequestId());
		assertEquals(dto.getPriorityLevel(), entity.getPriorityLevel());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Vote vote = new Vote();
		vote.setId("vote-1");
		vote.setUserId("user-456");
		vote.setRequestId("req-123");
		vote.setPriorityLevel(PriorityLevel.HIGH);
		vote.setCreatedAt(LocalDateTime.now());

		VoteResponseDTO dto = voteMapper.toResponse(vote);

		assertNotNull(dto);
		assertEquals(vote.getId(), dto.getId());
		assertEquals(vote.getUserId(), dto.getUserId());
		assertEquals(vote.getRequestId(), dto.getRequestId());
		assertEquals(vote.getPriorityLevel(), dto.getPriorityLevel());
		assertEquals(vote.getCreatedAt(), dto.getCreatedAt());
	}

	@Test
	void toResponse_shouldReturnNullWhenVoteIsNull() {
		VoteResponseDTO dto = voteMapper.toResponse(null);
		assertNull(dto);
	}

	@Test
	void toPriorityResponse_shouldMapAllFields() {
		Integer lowVotes = 1;
		Integer mediumVotes = 2;
		Integer highVotes = 3;
		Integer totalVotes = 6;
		Double lowPercentage = 16.67;
		Double mediumPercentage = 33.33;
		Double highPercentage = 50.0;

		RequestPriorityDTO dto = voteMapper.toPriorityResponse(lowVotes, mediumVotes, highVotes, totalVotes,
				lowPercentage, mediumPercentage, highPercentage);

		assertNotNull(dto);
		assertEquals(lowVotes, dto.getLowVotes());
		assertEquals(mediumVotes, dto.getMediumVotes());
		assertEquals(highVotes, dto.getHighVotes());
		assertEquals(totalVotes, dto.getTotalVotes());
		assertEquals(lowPercentage, dto.getLowPercentage());
		assertEquals(mediumPercentage, dto.getMediumPercentage());
		assertEquals(highPercentage, dto.getHighPercentage());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\auth\AuthenticationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class AuthenticationServiceTest {

	@Mock
	private AuthenticationManager authenticationManager;

	@Mock
	private UserRepository userRepository;

	@Mock
	private TokenService tokenService;

	@InjectMocks
	private AuthenticationService authenticationService;

	private LoginDTO loginDTO;
	private User user;
	private final String email = "maria.patos@example.com";
	private final String password = "patos123";
	private final String token = "jwt-token";

	@BeforeEach
	void setUp() {
		loginDTO = new LoginDTO();
		loginDTO.setEmail(email);
		loginDTO.setPassword(password);

		user = new User();
		user.setEmail(email);
		user.setRole(Role.CITIZEN);
	}

	@Test
	void login_shouldAuthenticateAndReturnToken() {
		when(userRepository.findByEmail(email)).thenReturn(Optional.of(user));
		when(tokenService.generateToken(email, Role.CITIZEN.name())).thenReturn(token);

		LoginResponseDTO response = authenticationService.login(loginDTO);
		assertEquals(token, response.getToken());

		verify(authenticationManager).authenticate(new UsernamePasswordAuthenticationToken(email, password));
		verify(userRepository).findByEmail(email);
		verify(tokenService).generateToken(email, Role.CITIZEN.name());
	}

	@Test
	void login_shouldThrowResourceNotFoundException_whenUserNotFound() {
		when(userRepository.findByEmail(email)).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> authenticationService.login(loginDTO));

		verify(authenticationManager).authenticate(any());
		verify(userRepository).findByEmail(email);
		verify(tokenService, never()).generateToken(anyString(), anyString());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\auth\CurrentUserServiceTest.java

```java
package com.iagomoreira.urbanflow.service.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class CurrentUserServiceTest {

	@Mock
	private UserRepository userRepository;

	@Mock
	private UserMapper userMapper;

	@InjectMocks
	private CurrentUserService currentUserService;

	private final String email = "maria.patos@example.com";
	private User user;
	private UserResponseDTO userResponseDTO;

	@BeforeEach
	void setUp() {
		user = new User();
		user.setEmail(email);
		user.setName("Maria Patos");
		user.setRole(Role.CITIZEN);

		userResponseDTO = new UserResponseDTO();
		userResponseDTO.setEmail(email);
		userResponseDTO.setName("Maria Patos");
		userResponseDTO.setRole(Role.CITIZEN);

		Authentication authentication = org.mockito.Mockito.mock(Authentication.class);
		when(authentication.getName()).thenReturn(email);

		SecurityContext securityContext = org.mockito.Mockito.mock(SecurityContext.class);
		when(securityContext.getAuthentication()).thenReturn(authentication);
		SecurityContextHolder.setContext(securityContext);
	}

	@Test
	void getCurrentUser_shouldReturnUserResponseDTO_whenUserExists() {
		when(userRepository.findByEmail(email)).thenReturn(Optional.of(user));
		when(userMapper.toResponse(user)).thenReturn(userResponseDTO);

		UserResponseDTO result = currentUserService.getCurrentUser();
		assertEquals(email, result.getEmail());
		assertEquals("Maria Patos", result.getName());
	}

	@Test
	void getCurrentUser_shouldThrowResourceNotFoundException_whenUserNotFound() {

		when(userRepository.findByEmail(email)).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> currentUserService.getCurrentUser());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\auth\TokenServiceTest.java

```java
package com.iagomoreira.urbanflow.service.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@ExtendWith(MockitoExtension.class)
class TokenServiceTest {

	private TokenService tokenService;

	private static final String SECRET = "mySuperSecretKeyForJWTGeneration12345678901234567890";
	private static final Long EXPIRATION = 3600000L;

	@BeforeEach
	void setUp() throws Exception {
		tokenService = new TokenService();

		Field secretField = TokenService.class.getDeclaredField("secret");
		secretField.setAccessible(true);
		secretField.set(tokenService, SECRET);

		Field expirationField = TokenService.class.getDeclaredField("expiration");
		expirationField.setAccessible(true);
		expirationField.set(tokenService, EXPIRATION);
	}

	@Test
	void generateToken_shouldReturnValidToken() {
		String token = tokenService.generateToken("test@email.com", "ADMIN");
		assertNotNull(token);
		assertTrue(token.split("\\.").length == 3);
	}

	@Test
	void extractUsername_shouldReturnCorrectEmail() {
		String token = tokenService.generateToken("test@email.com", "ADMIN");
		String extracted = tokenService.extractUsername(token);
		assertNotNull(extracted);
		assertTrue(extracted.equals("test@email.com"));
	}

	@Test
	void isTokenValid_shouldReturnTrueForValidToken() {
		String token = tokenService.generateToken("test@email.com", "ADMIN");
		assertTrue(tokenService.isTokenValid(token));
	}

	@Test
	void isTokenValid_shouldReturnFalseForExpiredToken() {
		Date pastDate = new Date(System.currentTimeMillis() - 10000);
		String token = Jwts.builder().subject("test@email.com").claim("role", "ADMIN").issuedAt(new Date())
				.expiration(pastDate).signWith(tokenService.getSigningKey()).compact();

		assertFalse(tokenService.isTokenValid(token));
	}

	@Test
	void isTokenValid_shouldReturnFalseForExpiredToken_WithSetter() throws InterruptedException {
		tokenService.setExpirationForTest(1L);
		String token = tokenService.generateToken("test@email.com", "ADMIN");
		Thread.sleep(10);
		assertFalse(tokenService.isTokenValid(token));
	}

	@Test
	void extractClaims_shouldContainRoleClaim() {
		String token = tokenService.generateToken("test@email.com", "OPERATOR");
		Claims claims = Jwts.parser().verifyWith(tokenService.getSigningKey()).build().parseSignedClaims(token)
				.getPayload();
		assertTrue(claims.get("role").equals("OPERATOR"));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\category\CategoryCommandServiceTest.java

```java
package com.iagomoreira.urbanflow.service.category;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.mapper.CategoryMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@ExtendWith(MockitoExtension.class)
class CategoryCommandServiceTest {

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private CategoryValidationService categoryValidationService;

	@Mock
	private CategoryMapper categoryMapper;

	@InjectMocks
	private CategoryCommandService categoryCommandService;

	private Category category;
	private CategoryResponseDTO responseDTO;
	private CreateCategoryDTO createDTO;
	private UpdateCategoryDTO updateDTO;

	@BeforeEach
	void setUp() {

		createDTO = new CreateCategoryDTO();
		createDTO.setName("Infrastructure");
		createDTO.setDescription("Description");
		createDTO.setDepartmentId("department-id");

		updateDTO = new UpdateCategoryDTO();
		updateDTO.setName("Updated");
		updateDTO.setDescription("Updated Description");
		updateDTO.setDepartmentId("department-id");

		category = new Category();
		category.setId("category-id");
		category.setName("Infrastructure");
		category.setDescription("Description");
		category.setDepartmentId("department-id");

		responseDTO = new CategoryResponseDTO();
		responseDTO.setId("category-id");
		responseDTO.setName("Infrastructure");
		responseDTO.setDescription("Description");
		responseDTO.setDepartmentId("department-id");
	}

	@Test
	void shouldCreateCategory() {

		doNothing().when(categoryValidationService).validateDepartmentExists(createDTO.getDepartmentId());

		when(categoryMapper.toEntity(createDTO)).thenReturn(category);
		when(categoryRepository.save(category)).thenReturn(category);
		when(categoryMapper.toResponse(category)).thenReturn(responseDTO);

		CategoryResponseDTO result = categoryCommandService.create(createDTO);

		assertEquals(responseDTO, result);

		verify(categoryValidationService).validateDepartmentExists(createDTO.getDepartmentId());
		verify(categoryMapper).toEntity(createDTO);
		verify(categoryRepository).save(category);
		verify(categoryMapper).toResponse(category);
	}

	@Test
	void shouldUpdateCategory() {

		when(categoryValidationService.validateCategoryExists("category-id")).thenReturn(category);
		doNothing().when(categoryValidationService).validateDepartmentExists(updateDTO.getDepartmentId());

		when(categoryRepository.save(category)).thenReturn(category);
		when(categoryMapper.toResponse(category)).thenReturn(responseDTO);

		CategoryResponseDTO result = categoryCommandService.update("category-id", updateDTO);

		assertEquals(responseDTO, result);

		verify(categoryValidationService).validateCategoryExists("category-id");
		verify(categoryValidationService).validateDepartmentExists(updateDTO.getDepartmentId());
		verify(categoryMapper).updateEntity(category, updateDTO);
		verify(categoryRepository).save(category);
		verify(categoryMapper).toResponse(category);
	}

	@Test
	void shouldDeleteCategory() {

		when(categoryValidationService.validateCategoryExists("category-id")).thenReturn(category);
		categoryCommandService.delete("category-id");

		verify(categoryValidationService).validateCategoryExists("category-id");
		verify(categoryRepository).deleteById("category-id");
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\category\CategoryQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.category;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.CategoryMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@ExtendWith(MockitoExtension.class)
class CategoryQueryServiceTest {

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private CategoryValidationService categoryValidationService;

	@Mock
	private CategoryMapper categoryMapper;

	@InjectMocks
	private CategoryQueryService categoryQueryService;

	private Category category;
	private CategoryResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		category = new Category();
		category.setId("category-id");
		category.setName("Iluminação");
		category.setDescription("Problemas relacionados à iluminação pública");
		category.setDepartmentId("department-id");

		responseDTO = new CategoryResponseDTO();
		responseDTO.setId("category-id");
		responseDTO.setName("Iluminação");
		responseDTO.setDescription("Problemas relacionados à iluminação pública");
		responseDTO.setDepartmentId("department-id");
	}

	@Test
	void shouldFindAllCategories() {

		when(categoryRepository.findAll()).thenReturn(List.of(category));
		when(categoryMapper.toResponse(category)).thenReturn(responseDTO);

		List<CategoryResponseDTO> result = categoryQueryService.findAll();

		assertEquals(1, result.size());
		assertEquals(responseDTO, result.get(0));

		verify(categoryRepository).findAll();
		verify(categoryMapper).toResponse(category);
	}

	@Test
	void shouldFindCategoryById() {

		when(categoryValidationService.validateCategoryExists("category-id")).thenReturn(category);
		when(categoryMapper.toResponse(category)).thenReturn(responseDTO);

		CategoryResponseDTO result = categoryQueryService.findById("category-id");
		assertEquals(responseDTO, result);

		verify(categoryValidationService).validateCategoryExists("category-id");
		verify(categoryMapper).toResponse(category);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\category\CategoryValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.category;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@ExtendWith(MockitoExtension.class)
class CategoryValidationServiceTest {

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private DepartmentRepository departmentRepository;

	@InjectMocks
	private CategoryValidationService categoryValidationService;

	private Category category;

	@BeforeEach
	void setup() {
		category = new Category();
		category.setId("1");
		category.setName("Iluminação Pública");
	}

	@Test
	void shouldReturnCategoryWhenCategoryExists() {

		when(categoryRepository.findById("1")).thenReturn(Optional.of(category));
		Category result = categoryValidationService.validateCategoryExists("1");
		assertEquals(category, result);
	}

	@Test
	void shouldThrowResourceNotFoundWhenCategoryDoesNotExist() {

		when(categoryRepository.findById("1")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> categoryValidationService.validateCategoryExists("1"));
	}

	@Test
	void shouldNotThrowExceptionWhenDepartmentExists() {

		when(departmentRepository.existsById("10")).thenReturn(true);
		assertDoesNotThrow(() -> categoryValidationService.validateDepartmentExists("10"));
	}

	@Test
	void shouldThrowResourceNotFoundWhenDepartmentDoesNotExist() {

		when(departmentRepository.existsById("10")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> categoryValidationService.validateDepartmentExists("10"));
	}

}
```

# src\test\java\com\iagomoreira\urbanflow\service\dashboard\DashboardMetricsServiceTest.java

```java
package com.iagomoreira.urbanflow.service.dashboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@ExtendWith(MockitoExtension.class)
class DashboardMetricsServiceTest {

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private UserRepository userRepository;

	@Mock
	private VoteRepository voteRepository;

	@Mock
	private FeedbackRepository feedbackRepository;

	@InjectMocks
	private DashboardMetricsService metricsService;

	private Request request1;
	private Request request2;
	private Feedback feedback1;
	private Feedback feedback2;
	private Feedback feedback3;

	@BeforeEach
	void setUp() {
		request1 = new Request();
		request1.setStatus(RequestStatus.RESOLVED);

		request2 = new Request();
		request2.setStatus(RequestStatus.IN_PROGRESS);

		feedback1 = new Feedback();
		feedback1.setRating(5);

		feedback2 = new Feedback();
		feedback2.setRating(4);

		feedback3 = new Feedback();
		feedback3.setRating(3);
	}

	@Test
	void getRequests_shouldReturnAllRequests() {
		List<Request> expected = Arrays.asList(request1, request2);
		when(requestRepository.findAll()).thenReturn(expected);

		List<Request> result = metricsService.getRequests();

		assertEquals(expected, result);
		verify(requestRepository).findAll();
	}

	@Test
	void countRequests_shouldReturnTotalRequests() {
		when(requestRepository.count()).thenReturn(10L);

		long result = metricsService.countRequests();

		assertEquals(10L, result);
		verify(requestRepository).count();
	}

	@Test
	void countByStatus_shouldReturnCountByStatus() {
		List<Request> resolvedRequests = Collections.singletonList(request1);
		when(requestRepository.findByStatus(RequestStatus.RESOLVED)).thenReturn(resolvedRequests);

		long result = metricsService.countByStatus(RequestStatus.RESOLVED);

		assertEquals(1L, result);
		verify(requestRepository).findByStatus(RequestStatus.RESOLVED);
	}

	@Test
	void countUsers_shouldReturnTotalUsers() {
		when(userRepository.count()).thenReturn(25L);

		long result = metricsService.countUsers();

		assertEquals(25L, result);
		verify(userRepository).count();
	}

	@Test
	void countVotes_shouldReturnTotalVotes() {
		when(voteRepository.count()).thenReturn(15L);

		long result = metricsService.countVotes();

		assertEquals(15L, result);
		verify(voteRepository).count();
	}

	@Test
	void countFeedbacks_shouldReturnTotalFeedbacks() {
		when(feedbackRepository.count()).thenReturn(8L);

		long result = metricsService.countFeedbacks();

		assertEquals(8L, result);
		verify(feedbackRepository).count();
	}

	@Test
	void getFeedbacks_shouldReturnAllFeedbacks() {
		List<Feedback> expected = Arrays.asList(feedback1, feedback2, feedback3);
		when(feedbackRepository.findAll()).thenReturn(expected);

		List<Feedback> result = metricsService.getFeedbacks();

		assertEquals(expected, result);
		verify(feedbackRepository).findAll();
	}

	@Test
	void getAverageRating_shouldReturnAverage() {
		List<Feedback> feedbacks = Arrays.asList(feedback1, feedback2, feedback3);
		when(feedbackRepository.findAll()).thenReturn(feedbacks);

		double result = metricsService.getAverageRating();

		assertEquals(4.0, result, 0.01);
		verify(feedbackRepository).findAll();
	}

	@Test
	void getAverageRating_shouldReturnZeroWhenNoFeedbacks() {
		when(feedbackRepository.findAll()).thenReturn(List.of());

		double result = metricsService.getAverageRating();

		assertEquals(0.0, result, 0.01);
		verify(feedbackRepository).findAll();
	}

	@Test
	void getResolutionRate_shouldCalculateCorrectly() {
		when(requestRepository.count()).thenReturn(10L);
		when(requestRepository.findByStatus(RequestStatus.RESOLVED))
				.thenReturn(Arrays.asList(new Request(), new Request(), new Request()));

		double result = metricsService.getResolutionRate();

		assertEquals(30.0, result, 0.01);
		verify(requestRepository).count();
		verify(requestRepository).findByStatus(RequestStatus.RESOLVED);
	}

	@Test
	void getResolutionRate_shouldReturnZeroWhenNoRequests() {
		when(requestRepository.count()).thenReturn(0L);

		double result = metricsService.getResolutionRate();

		assertEquals(0.0, result, 0.01);
		verify(requestRepository).count();
		verify(requestRepository, org.mockito.Mockito.never()).findByStatus(RequestStatus.RESOLVED);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\dashboard\DashboardQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.dashboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.mapper.DashboardMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@ExtendWith(MockitoExtension.class)
class DashboardQueryServiceTest {

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private DashboardMapper dashboardMapper;

	@InjectMocks
	private DashboardQueryService queryService;

	private Request request1;
	private Request request2;
	private Request request3;
	private Request request4;
	private Request request5;
	private Request request6;

	private Category category1;
	private Category category2;

	private SubCategory subCategory1;
	private SubCategory subCategory2;

	@BeforeEach
	void setUp() {
		request1 = new Request();
		request1.setCategoryId("cat-1");
		request1.setSubCategoryId("sub-1");

		request2 = new Request();
		request2.setCategoryId("cat-1");
		request2.setSubCategoryId("sub-1");

		request3 = new Request();
		request3.setCategoryId("cat-1");
		request3.setSubCategoryId("sub-2");

		request4 = new Request();
		request4.setCategoryId("cat-2");
		request4.setSubCategoryId("sub-2");

		request5 = new Request();
		request5.setCategoryId("cat-2");
		request5.setSubCategoryId("sub-2");

		request6 = new Request();
		request6.setCategoryId("cat-3");
		request6.setSubCategoryId("sub-3");

		category1 = new Category();
		category1.setId("cat-1");
		category1.setName("Infraestrutura");

		category2 = new Category();
		category2.setId("cat-2");
		category2.setName("Limpeza Urbana");

		subCategory1 = new SubCategory();
		subCategory1.setId("sub-1");
		subCategory1.setName("Pavimentação");

		subCategory2 = new SubCategory();
		subCategory2.setId("sub-2");
		subCategory2.setName("Coleta de Lixo");
	}

	@Test
	void getTopCategories_shouldReturnTop5Categories() {
		List<Request> requests = List.of(request1, request2, request3, request4, request5, request6);
		when(requestRepository.findAll()).thenReturn(requests);

		when(categoryRepository.findById("cat-1")).thenReturn(Optional.of(category1));
		when(categoryRepository.findById("cat-2")).thenReturn(Optional.of(category2));
		when(categoryRepository.findById("cat-3")).thenReturn(Optional.empty());

		TopCategoryDTO dto1 = new TopCategoryDTO();
		dto1.setCategoryId("cat-1");
		dto1.setCategoryName("Infraestrutura");
		dto1.setTotalRequests(3);
		when(dashboardMapper.toTopCategoryResponse("cat-1", "Infraestrutura", 3)).thenReturn(dto1);

		TopCategoryDTO dto2 = new TopCategoryDTO();
		dto2.setCategoryId("cat-2");
		dto2.setCategoryName("Limpeza Urbana");
		dto2.setTotalRequests(2);
		when(dashboardMapper.toTopCategoryResponse("cat-2", "Limpeza Urbana", 2)).thenReturn(dto2);

		TopCategoryDTO dto3 = new TopCategoryDTO();
		dto3.setCategoryId("cat-3");
		dto3.setCategoryName("Unknown");
		dto3.setTotalRequests(1);
		when(dashboardMapper.toTopCategoryResponse("cat-3", "Unknown", 1)).thenReturn(dto3);

		List<TopCategoryDTO> result = queryService.getTopCategories();

		assertNotNull(result);
		assertEquals(3, result.size());
		assertEquals("cat-1", result.get(0).getCategoryId());
		assertEquals("Infraestrutura", result.get(0).getCategoryName());
		assertEquals(3, result.get(0).getTotalRequests());
		assertEquals("cat-2", result.get(1).getCategoryId());
		assertEquals("Limpeza Urbana", result.get(1).getCategoryName());
		assertEquals(2, result.get(1).getTotalRequests());
		assertEquals("cat-3", result.get(2).getCategoryId());
		assertEquals("Unknown", result.get(2).getCategoryName());
		assertEquals(1, result.get(2).getTotalRequests());

		verify(requestRepository).findAll();
		verify(categoryRepository).findById("cat-1");
		verify(categoryRepository).findById("cat-2");
		verify(categoryRepository).findById("cat-3");
		verify(dashboardMapper).toTopCategoryResponse("cat-1", "Infraestrutura", 3);
		verify(dashboardMapper).toTopCategoryResponse("cat-2", "Limpeza Urbana", 2);
		verify(dashboardMapper).toTopCategoryResponse("cat-3", "Unknown", 1);
	}

	@Test
	void getTopCategories_shouldUseUnknownForMissingCategory() {
		List<Request> requests = List.of(request1);
		when(requestRepository.findAll()).thenReturn(requests);

		when(categoryRepository.findById("cat-1")).thenReturn(Optional.empty());

		TopCategoryDTO expectedDto = new TopCategoryDTO();
		expectedDto.setCategoryId("cat-1");
		expectedDto.setCategoryName("Unknown");
		expectedDto.setTotalRequests(1);
		when(dashboardMapper.toTopCategoryResponse("cat-1", "Unknown", 1)).thenReturn(expectedDto);

		List<TopCategoryDTO> result = queryService.getTopCategories();

		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("cat-1", result.get(0).getCategoryId());
		assertEquals("Unknown", result.get(0).getCategoryName());
		assertEquals(1, result.get(0).getTotalRequests());

		verify(dashboardMapper).toTopCategoryResponse("cat-1", "Unknown", 1);
	}

	@Test
	void getTopCategories_shouldReturnEmptyListWhenNoRequests() {
		when(requestRepository.findAll()).thenReturn(List.of());

		List<TopCategoryDTO> result = queryService.getTopCategories();

		assertNotNull(result);
		assertEquals(0, result.size());

		verify(requestRepository).findAll();
		verify(categoryRepository, never()).findById(anyString());
		verify(dashboardMapper, never()).toTopCategoryResponse(anyString(), anyString(), anyInt());
	}

	@Test
	void getTopSubCategories_shouldReturnTop5SubCategories() {
		List<Request> requests = List.of(request1, request2, request3, request4, request5, request6);
		when(requestRepository.findAll()).thenReturn(requests);

		when(subCategoryRepository.findById("sub-1")).thenReturn(Optional.of(subCategory1));
		when(subCategoryRepository.findById("sub-2")).thenReturn(Optional.of(subCategory2));
		when(subCategoryRepository.findById("sub-3")).thenReturn(Optional.empty());

		TopSubCategoryDTO dto1 = new TopSubCategoryDTO();
		dto1.setSubCategoryId("sub-1");
		dto1.setSubCategoryName("Pavimentação");
		dto1.setTotalRequests(2);
		when(dashboardMapper.toTopSubCategoryResponse("sub-1", "Pavimentação", 2)).thenReturn(dto1);

		TopSubCategoryDTO dto2 = new TopSubCategoryDTO();
		dto2.setSubCategoryId("sub-2");
		dto2.setSubCategoryName("Coleta de Lixo");
		dto2.setTotalRequests(3);
		when(dashboardMapper.toTopSubCategoryResponse("sub-2", "Coleta de Lixo", 3)).thenReturn(dto2);

		TopSubCategoryDTO dto3 = new TopSubCategoryDTO();
		dto3.setSubCategoryId("sub-3");
		dto3.setSubCategoryName("Unknown");
		dto3.setTotalRequests(1);
		when(dashboardMapper.toTopSubCategoryResponse("sub-3", "Unknown", 1)).thenReturn(dto3);

		List<TopSubCategoryDTO> result = queryService.getTopSubCategories();

		assertNotNull(result);
		assertEquals(3, result.size());
		assertEquals("sub-2", result.get(0).getSubCategoryId());
		assertEquals("Coleta de Lixo", result.get(0).getSubCategoryName());
		assertEquals(3, result.get(0).getTotalRequests());
		assertEquals("sub-1", result.get(1).getSubCategoryId());
		assertEquals("Pavimentação", result.get(1).getSubCategoryName());
		assertEquals(2, result.get(1).getTotalRequests());
		assertEquals("sub-3", result.get(2).getSubCategoryId());
		assertEquals("Unknown", result.get(2).getSubCategoryName());
		assertEquals(1, result.get(2).getTotalRequests());

		verify(requestRepository).findAll();
		verify(subCategoryRepository).findById("sub-2");
		verify(subCategoryRepository).findById("sub-1");
		verify(subCategoryRepository).findById("sub-3");
		verify(dashboardMapper).toTopSubCategoryResponse("sub-2", "Coleta de Lixo", 3);
		verify(dashboardMapper).toTopSubCategoryResponse("sub-1", "Pavimentação", 2);
		verify(dashboardMapper).toTopSubCategoryResponse("sub-3", "Unknown", 1);
	}

	@Test
	void getTopSubCategories_shouldUseUnknownForMissingSubCategory() {
		List<Request> requests = List.of(request1);
		when(requestRepository.findAll()).thenReturn(requests);

		when(subCategoryRepository.findById("sub-1")).thenReturn(Optional.empty());

		TopSubCategoryDTO expectedDto = new TopSubCategoryDTO();
		expectedDto.setSubCategoryId("sub-1");
		expectedDto.setSubCategoryName("Unknown");
		expectedDto.setTotalRequests(1);
		when(dashboardMapper.toTopSubCategoryResponse("sub-1", "Unknown", 1)).thenReturn(expectedDto);

		List<TopSubCategoryDTO> result = queryService.getTopSubCategories();

		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("sub-1", result.get(0).getSubCategoryId());
		assertEquals("Unknown", result.get(0).getSubCategoryName());
		assertEquals(1, result.get(0).getTotalRequests());

		verify(dashboardMapper).toTopSubCategoryResponse("sub-1", "Unknown", 1);
	}

	@Test
	void getTopSubCategories_shouldReturnEmptyListWhenNoRequests() {
		when(requestRepository.findAll()).thenReturn(List.of());

		List<TopSubCategoryDTO> result = queryService.getTopSubCategories();

		assertNotNull(result);
		assertEquals(0, result.size());

		verify(requestRepository).findAll();
		verify(subCategoryRepository, never()).findById(anyString());
		verify(dashboardMapper, never()).toTopSubCategoryResponse(anyString(), anyString(), anyInt());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\dashboard\DashboardStatisticsServiceTest.java

```java
package com.iagomoreira.urbanflow.service.dashboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.mapper.DashboardMapper;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@ExtendWith(MockitoExtension.class)
class DashboardStatisticsServiceTest {

	@Mock
	private DashboardMetricsService metricsService;

	@Mock
	private DashboardMapper dashboardMapper;

	@InjectMocks
	private DashboardStatisticsService statisticsService;

	private DashboardStatisticsDTO statisticsDTO;
	private DashboardOverviewDTO overviewDTO;

	@BeforeEach
	void setUp() {
		statisticsDTO = new DashboardStatisticsDTO();
		statisticsDTO.setTotalRequests(100);
		statisticsDTO.setReceivedRequests(20);

		overviewDTO = new DashboardOverviewDTO();
		overviewDTO.setTotalRequests(100L);
		overviewDTO.setReceivedRequests(20L);
	}

	@Test
	void getStatistics_shouldCallMetricsAndMapper() {
		when(metricsService.countRequests()).thenReturn(100L);
		when(metricsService.countByStatus(RequestStatus.RECEIVED)).thenReturn(20L);
		when(metricsService.countByStatus(RequestStatus.IN_PROGRESS)).thenReturn(30L);
		when(metricsService.countByStatus(RequestStatus.RESOLVED)).thenReturn(40L);
		when(metricsService.countByStatus(RequestStatus.CANCELLED)).thenReturn(10L);
		when(metricsService.getResolutionRate()).thenReturn(40.0);
		when(metricsService.countUsers()).thenReturn(50L);
		when(metricsService.countVotes()).thenReturn(60L);
		when(metricsService.countFeedbacks()).thenReturn(25L);
		when(metricsService.getAverageRating()).thenReturn(4.2);

		when(dashboardMapper.toStatisticsResponse(100, 20, 30, 40, 10, 40.0, 50, 60, 25, 4.2))
				.thenReturn(statisticsDTO);

		DashboardStatisticsDTO result = statisticsService.getStatistics();

		assertEquals(statisticsDTO, result);

		verify(metricsService).countRequests();
		verify(metricsService).countByStatus(RequestStatus.RECEIVED);
		verify(metricsService).countByStatus(RequestStatus.IN_PROGRESS);
		verify(metricsService).countByStatus(RequestStatus.RESOLVED);
		verify(metricsService).countByStatus(RequestStatus.CANCELLED);
		verify(metricsService).getResolutionRate();
		verify(metricsService).countUsers();
		verify(metricsService).countVotes();
		verify(metricsService).countFeedbacks();
		verify(metricsService).getAverageRating();
		verify(dashboardMapper).toStatisticsResponse(100, 20, 30, 40, 10, 40.0, 50, 60, 25, 4.2);
	}

	@Test
	void getOverview_shouldCallMetricsAndMapper() {
		when(metricsService.countRequests()).thenReturn(100L);
		when(metricsService.countByStatus(RequestStatus.RECEIVED)).thenReturn(20L);
		when(metricsService.countByStatus(RequestStatus.UNDER_REVIEW)).thenReturn(5L);
		when(metricsService.countByStatus(RequestStatus.APPROVED)).thenReturn(8L);
		when(metricsService.countByStatus(RequestStatus.IN_PROGRESS)).thenReturn(30L);
		when(metricsService.countByStatus(RequestStatus.RESOLVED)).thenReturn(40L);
		when(metricsService.countByStatus(RequestStatus.CANCELLED)).thenReturn(10L);
		when(metricsService.countByStatus(RequestStatus.REJECTED)).thenReturn(3L);
		when(metricsService.countUsers()).thenReturn(50L);
		when(metricsService.countVotes()).thenReturn(60L);
		when(metricsService.getAverageRating()).thenReturn(4.2);

		when(dashboardMapper.toOverviewResponse(100L, 20L, 5L, 8L, 30L, 40L, 10L, 3L, 50L, 60L, 4.2))
				.thenReturn(overviewDTO);

		DashboardOverviewDTO result = statisticsService.getOverview();

		assertEquals(overviewDTO, result);

		verify(metricsService).countRequests();
		verify(metricsService).countByStatus(RequestStatus.RECEIVED);
		verify(metricsService).countByStatus(RequestStatus.UNDER_REVIEW);
		verify(metricsService).countByStatus(RequestStatus.APPROVED);
		verify(metricsService).countByStatus(RequestStatus.IN_PROGRESS);
		verify(metricsService).countByStatus(RequestStatus.RESOLVED);
		verify(metricsService).countByStatus(RequestStatus.CANCELLED);
		verify(metricsService).countByStatus(RequestStatus.REJECTED);
		verify(metricsService).countUsers();
		verify(metricsService).countVotes();
		verify(metricsService).getAverageRating();
		verify(dashboardMapper).toOverviewResponse(100L, 20L, 5L, 8L, 30L, 40L, 10L, 3L, 50L, 60L, 4.2);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\department\DepartmentCommandServiceTest.java

```java
package com.iagomoreira.urbanflow.service.department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.mapper.DepartmentMapper;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@ExtendWith(MockitoExtension.class)
class DepartmentCommandServiceTest {

	@Mock
	private DepartmentRepository departmentRepository;

	@Mock
	private DepartmentValidationService departmentValidationService;

	@Mock
	private DepartmentMapper departmentMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private DepartmentCommandService departmentCommandService;

	private Department department;
	private DepartmentResponseDTO responseDTO;
	private CreateDepartmentDTO createDTO;
	private UpdateDepartmentDTO updateDTO;

	private final LocalDateTime now = LocalDateTime.of(2025, 1, 1, 10, 0);

	@BeforeEach
	void setUp() {

		createDTO = new CreateDepartmentDTO();
		createDTO.setName("Infrastructure");
		createDTO.setDescription("Description");

		updateDTO = new UpdateDepartmentDTO();
		updateDTO.setName("Updated");
		updateDTO.setDescription("Updated Description");

		department = new Department();
		department.setId("1");
		department.setName("Infrastructure");
		department.setDescription("Description");

		responseDTO = new DepartmentResponseDTO();
		responseDTO.setId("1");
		responseDTO.setName("Infrastructure");
		responseDTO.setDescription("Description");
	}

	@Test
	void shouldCreateDepartment() {

		doNothing().when(departmentValidationService).validateDepartmentNameAlreadyExists(createDTO.getName());

		when(departmentMapper.toEntity(createDTO)).thenReturn(department);
		when(dateTimeProvider.now()).thenReturn(now);
		when(departmentRepository.save(department)).thenReturn(department);
		when(departmentMapper.toResponse(department)).thenReturn(responseDTO);

		DepartmentResponseDTO result = departmentCommandService.create(createDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, department.getCreatedAt());

		verify(departmentValidationService).validateDepartmentNameAlreadyExists(createDTO.getName());
		verify(departmentMapper).toEntity(createDTO);
		verify(departmentRepository).save(department);
		verify(departmentMapper).toResponse(department);
	}

	@Test
	void shouldUpdateDepartment() {

		when(departmentValidationService.validateDepartmentExists("1")).thenReturn(department);
		doNothing().when(departmentValidationService).validateDepartmentNameForUpdate(department, updateDTO.getName());

		when(dateTimeProvider.now()).thenReturn(now);
		when(departmentRepository.save(department)).thenReturn(department);
		when(departmentMapper.toResponse(department)).thenReturn(responseDTO);

		DepartmentResponseDTO result = departmentCommandService.update("1", updateDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, department.getUpdatedAt());

		verify(departmentMapper).updateEntity(department, updateDTO);
		verify(departmentRepository).save(department);
		verify(departmentMapper).toResponse(department);
	}

	@Test
	void shouldDeleteDepartment() {

		when(departmentValidationService.validateDepartmentExists("1")).thenReturn(department);
		departmentCommandService.delete("1");

		verify(departmentValidationService).validateDepartmentExists("1");
		verify(departmentRepository).deleteById("1");
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\department\DepartmentQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.mapper.DepartmentMapper;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@ExtendWith(MockitoExtension.class)
class DepartmentQueryServiceTest {

	@Mock
	private DepartmentRepository departmentRepository;

	@Mock
	private DepartmentValidationService departmentValidationService;

	@Mock
	private DepartmentMapper departmentMapper;

	@InjectMocks
	private DepartmentQueryService departmentQueryService;

	private Department department;
	private DepartmentResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		department = new Department();
		department.setId("department-id");
		department.setName("Infraestrutura");
		department.setDescription("Departamento responsável pela infraestrutura.");

		responseDTO = new DepartmentResponseDTO();
		responseDTO.setId("department-id");
		responseDTO.setName("Infraestrutura");
		responseDTO.setDescription("Departamento responsável pela infraestrutura.");
	}

	@Test
	void shouldFindAllDepartments() {

		when(departmentRepository.findAll()).thenReturn(List.of(department));
		when(departmentMapper.toResponse(department)).thenReturn(responseDTO);

		List<DepartmentResponseDTO> result = departmentQueryService.findAll();

		assertEquals(1, result.size());
		assertEquals(responseDTO, result.get(0));

		verify(departmentRepository).findAll();
		verify(departmentMapper).toResponse(department);
	}

	@Test
	void shouldFindDepartmentById() {

		when(departmentValidationService.validateDepartmentExists("department-id")).thenReturn(department);
		when(departmentMapper.toResponse(department)).thenReturn(responseDTO);

		DepartmentResponseDTO result = departmentQueryService.findById("department-id");
		assertEquals(responseDTO, result);

		verify(departmentValidationService).validateDepartmentExists("department-id");
		verify(departmentMapper).toResponse(department);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\department\DepartmentValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.department;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@ExtendWith(MockitoExtension.class)
class DepartmentValidationServiceTest {

	@Mock
	private DepartmentRepository departmentRepository;

	@InjectMocks
	private DepartmentValidationService departmentValidationService;

	private Department department;

	@BeforeEach
	void setup() {
		department = new Department();
		department.setId("1");
		department.setName("Infraestrutura");
	}

	@Test
	void shouldReturnDepartmentWhenDepartmentExists() {

		when(departmentRepository.findById("1")).thenReturn(Optional.of(department));
		Department result = departmentValidationService.validateDepartmentExists("1");
		assertEquals(department, result);
	}

	@Test
	void shouldThrowResourceNotFoundWhenDepartmentDoesNotExist() {

		when(departmentRepository.findById("1")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> departmentValidationService.validateDepartmentExists("1"));
	}

	@Test
	void shouldNotThrowExceptionWhenDepartmentNameDoesNotExist() {

		when(departmentRepository.existsByName("Infraestrutura")).thenReturn(false);
		assertDoesNotThrow(() -> departmentValidationService.validateDepartmentNameAlreadyExists("Infraestrutura"));
	}

	@Test
	void shouldThrowBusinessExceptionWhenDepartmentNameAlreadyExists() {

		when(departmentRepository.existsByName("Infraestrutura")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> departmentValidationService.validateDepartmentNameAlreadyExists("Infraestrutura"));
	}

	@Test
	void shouldNotThrowExceptionWhenUpdatingWithSameDepartmentName() {
		assertDoesNotThrow(
				() -> departmentValidationService.validateDepartmentNameForUpdate(department, "Infraestrutura"));
	}

	@Test
	void shouldNotThrowExceptionWhenUpdatingToAvailableDepartmentName() {

		when(departmentRepository.existsByName("Limpeza")).thenReturn(false);
		assertDoesNotThrow(() -> departmentValidationService.validateDepartmentNameForUpdate(department, "Limpeza"));
	}

	@Test
	void shouldThrowBusinessExceptionWhenUpdatingToExistingDepartmentName() {

		when(departmentRepository.existsByName("Limpeza")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> departmentValidationService.validateDepartmentNameForUpdate(department, "Limpeza"));
	}
}

```

# src\test\java\com\iagomoreira\urbanflow\service\feedback\FeedbackCommandServiceTest.java

```java
package com.iagomoreira.urbanflow.service.feedback;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@ExtendWith(MockitoExtension.class)
class FeedbackCommandServiceTest {

	@Mock
	private FeedbackRepository feedbackRepository;

	@Mock
	private FeedbackValidationService feedbackValidationService;

	@Mock
	private FeedbackMapper feedbackMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@Mock
	private SecurityService securityService;

	@InjectMocks
	private FeedbackCommandService service;

	private CreateFeedbackDTO dto;
	private Feedback feedback;
	private FeedbackResponseDTO response;
	private Request request;

	@BeforeEach
	void setup() {

		dto = new CreateFeedbackDTO();
		dto.setRequestId("request-id");
		dto.setRating(5);
		dto.setComment("Excelente");

		feedback = new Feedback();
		response = new FeedbackResponseDTO();
		request = new Request();
	}

	@Test
	void shouldCreateFeedbackSuccessfully() {

		LocalDateTime now = LocalDateTime.now();

		when(securityService.getAuthenticatedUserId()).thenReturn("user-id");
		when(feedbackValidationService.validateRequestExists(dto.getRequestId())).thenReturn(request);
		when(feedbackMapper.toEntity(dto)).thenReturn(feedback);
		when(dateTimeProvider.now()).thenReturn(now);
		when(feedbackRepository.save(feedback)).thenReturn(feedback);
		when(feedbackMapper.toResponse(feedback)).thenReturn(response);

		FeedbackResponseDTO result = service.create(dto);

		ArgumentCaptor<Feedback> captor = ArgumentCaptor.forClass(Feedback.class);

		verify(feedbackRepository).save(captor.capture());

		Feedback saved = captor.getValue();

		assertEquals("user-id", saved.getUserId());
		assertEquals(now, saved.getCreatedAt());
		assertEquals(response, result);

		verify(feedbackValidationService).validateUserExists("user-id");
		verify(feedbackValidationService).validateRequestExists(dto.getRequestId());
		verify(feedbackValidationService).validateResolvedRequest(request);
		verify(feedbackValidationService).validateDuplicateFeedback("user-id", dto.getRequestId());
	}

	@Test
	void shouldStopExecutionWhenValidationFails() {

		when(securityService.getAuthenticatedUserId()).thenReturn("user-id");
		doThrow(new BusinessException("error")).when(feedbackValidationService).validateUserExists("user-id");

		assertThrows(BusinessException.class, () -> service.create(dto));

		verify(feedbackRepository, never()).save(any());
		verify(feedbackMapper, never()).toEntity(any());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\feedback\FeedbackQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.feedback;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@ExtendWith(MockitoExtension.class)
class FeedbackQueryServiceTest {

	@Mock
	private FeedbackRepository feedbackRepository;

	@Mock
	private FeedbackValidationService feedbackValidationService;

	@Mock
	private FeedbackMapper feedbackMapper;

	@InjectMocks
	private FeedbackQueryService feedbackQueryService;

	private Feedback feedback;
	private FeedbackResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		feedback = new Feedback();
		feedback.setId("feedback-id");
		feedback.setRequestId("request-id");
		feedback.setUserId("user-id");
		feedback.setRating(5);
		feedback.setComment("Excelente atendimento");
		feedback.setCreatedAt(LocalDateTime.now());

		responseDTO = new FeedbackResponseDTO();
		responseDTO.setId("feedback-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setUserId("user-id");
		responseDTO.setRating(5);
		responseDTO.setComment("Excelente atendimento");
		responseDTO.setCreatedAt(feedback.getCreatedAt());
	}

	@Test
	void shouldFindAllFeedbacks() {

		when(feedbackRepository.findAll()).thenReturn(List.of(feedback));
		when(feedbackMapper.toResponse(feedback)).thenReturn(responseDTO);

		List<FeedbackResponseDTO> result = feedbackQueryService.findAll();
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(feedbackRepository).findAll();
		verify(feedbackMapper).toResponse(feedback);
	}

	@Test
	void shouldFindFeedbacksByRequest() {

		when(feedbackValidationService.validateRequestExists("request-id")).thenReturn(null);
		when(feedbackRepository.findByRequestId("request-id")).thenReturn(List.of(feedback));
		when(feedbackMapper.toResponse(feedback)).thenReturn(responseDTO);

		List<FeedbackResponseDTO> result = feedbackQueryService.findByRequest("request-id");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(feedbackValidationService).validateRequestExists("request-id");
		verify(feedbackRepository).findByRequestId("request-id");
		verify(feedbackMapper).toResponse(feedback);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\feedback\FeedbackValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.feedback;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class FeedbackValidationServiceTest {

	@Mock
	private UserRepository userRepository;

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private FeedbackRepository feedbackRepository;

	@InjectMocks
	private FeedbackValidationService feedbackValidationService;

	private Request request;

	@BeforeEach
	void setUp() {
		request = new Request();
		request.setId("request-id");
		request.setStatus(RequestStatus.RESOLVED);
	}

	@Test
	void shouldValidateUserExists() {

		when(userRepository.existsById("user-id")).thenReturn(true);
		assertDoesNotThrow(() -> feedbackValidationService.validateUserExists("user-id"));
	}

	@Test
	void shouldThrowWhenUserDoesNotExist() {

		when(userRepository.existsById("user-id")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> feedbackValidationService.validateUserExists("user-id"));
	}

	@Test
	void shouldValidateRequestExists() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));
		Request result = feedbackValidationService.validateRequestExists("request-id");
		assertEquals(request, result);
	}

	@Test
	void shouldThrowWhenRequestDoesNotExist() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class,
				() -> feedbackValidationService.validateRequestExists("request-id"));
	}

	@Test
	void shouldValidateResolvedRequest() {

		request.setStatus(RequestStatus.RESOLVED);
		assertDoesNotThrow(() -> feedbackValidationService.validateResolvedRequest(request));
	}

	@Test
	void shouldThrowWhenRequestIsNotResolved() {

		request.setStatus(RequestStatus.IN_PROGRESS);
		assertThrows(BusinessException.class, () -> feedbackValidationService.validateResolvedRequest(request));
	}

	@Test
	void shouldValidateDuplicateFeedback() {

		when(feedbackRepository.existsByUserIdAndRequestId("user-id", "request-id")).thenReturn(false);
		assertDoesNotThrow(() -> feedbackValidationService.validateDuplicateFeedback("user-id", "request-id"));
	}

	@Test
	void shouldThrowWhenFeedbackAlreadyExists() {

		when(feedbackRepository.existsByUserIdAndRequestId("user-id", "request-id")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> feedbackValidationService.validateDuplicateFeedback("user-id", "request-id"));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\legislation\LegislationQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.legislation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.mapper.LegislationMapper;
import com.iagomoreira.urbanflow.model.Legislation;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@ExtendWith(MockitoExtension.class)
class LegislationQueryServiceTest {

	@Mock
	private LegislationRepository legislationRepository;

	@Mock
	private LegislationValidationService legislationValidationService;

	@Mock
	private LegislationMapper legislationMapper;

	@InjectMocks
	private LegislationQueryService legislationQueryService;

	private Legislation legislation;
	private LegislationResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		legislation = new Legislation();
		legislation.setId("legislation-id");
		legislation.setTitle("Lei Municipal");
		legislation.setDescription("Descrição da lei");

		responseDTO = new LegislationResponseDTO();
		responseDTO.setId("legislation-id");
		responseDTO.setTitle("Lei Municipal");
		responseDTO.setDescription("Descrição da lei");
	}

	@Test
	void shouldFindAllLegislations() {

		when(legislationRepository.findAll()).thenReturn(List.of(legislation));
		when(legislationMapper.toResponse(legislation)).thenReturn(responseDTO);

		List<LegislationResponseDTO> result = legislationQueryService.findAll();

		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(legislationRepository).findAll();
		verify(legislationMapper).toResponse(legislation);
	}

	@Test
	void shouldFindLegislationById() {

		when(legislationValidationService.validateLegislationExists("legislation-id")).thenReturn(legislation);
		when(legislationMapper.toResponse(legislation)).thenReturn(responseDTO);

		LegislationResponseDTO result = legislationQueryService.findById("legislation-id");
		assertThat(result).isEqualTo(responseDTO);

		verify(legislationValidationService).validateLegislationExists("legislation-id");
		verify(legislationMapper).toResponse(legislation);
	}

	@Test
	void shouldFindLegislationByKeyword() {

		when(legislationRepository.searchByKeyword("mobilidade")).thenReturn(List.of(legislation));
		when(legislationMapper.toResponse(legislation)).thenReturn(responseDTO);

		List<LegislationResponseDTO> result = legislationQueryService.findByKeyword("mobilidade");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(legislationRepository).searchByKeyword("mobilidade");
		verify(legislationMapper).toResponse(legislation);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\legislation\LegislationValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.legislation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Legislation;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@ExtendWith(MockitoExtension.class)
class LegislationValidationServiceTest {

	@Mock
	private LegislationRepository legislationRepository;

	@InjectMocks
	private LegislationValidationService legislationValidationService;

	private Legislation legislation;

	@BeforeEach
	void setUp() {
		legislation = new Legislation();
		legislation.setId("legislation-id");
	}

	@Test
	void shouldReturnLegislationWhenExists() {

		when(legislationRepository.findById("legislation-id")).thenReturn(Optional.of(legislation));
		Legislation result = legislationValidationService.validateLegislationExists("legislation-id");
		assertEquals(legislation, result);
	}

	@Test
	void shouldThrowWhenLegislationDoesNotExist() {

		when(legislationRepository.findById("legislation-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class,
				() -> legislationValidationService.validateLegislationExists("legislation-id"));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\media\MediaCommandServiceTest.java

```java
package com.iagomoreira.urbanflow.service.media;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.mapper.MediaMapper;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.model.enums.MediaType;
import com.iagomoreira.urbanflow.repository.MediaRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@ExtendWith(MockitoExtension.class)
class MediaCommandServiceTest {

	@Mock
	private MediaRepository mediaRepository;

	@Mock
	private MediaValidationService mediaValidationService;

	@Mock
	private MediaMapper mediaMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private MediaCommandService mediaCommandService;

	private CreateMediaDTO createDTO;
	private Media media;
	private MediaResponseDTO responseDTO;

	private final LocalDateTime now = LocalDateTime.of(2025, 1, 1, 10, 0);

	@BeforeEach
	void setUp() {

		createDTO = new CreateMediaDTO();
		createDTO.setRequestId("request-id");
		createDTO.setType(MediaType.IMAGE);
		createDTO.setUrl("https://image.com/photo.jpg");

		media = new Media();
		media.setId("media-id");
		media.setRequestId("request-id");
		media.setType(MediaType.IMAGE);
		media.setUrl("https://image.com/photo.jpg");

		responseDTO = new MediaResponseDTO();
		responseDTO.setId("media-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setType(MediaType.IMAGE);
		responseDTO.setUrl("https://image.com/photo.jpg");
		responseDTO.setUploadedAt(now);
	}

	@Test
	void shouldCreateMedia() {

		doNothing().when(mediaValidationService).validateRequest(createDTO.getRequestId());

		when(mediaMapper.toEntity(createDTO)).thenReturn(media);
		when(dateTimeProvider.now()).thenReturn(now);
		when(mediaRepository.save(media)).thenReturn(media);
		when(mediaMapper.toResponse(media)).thenReturn(responseDTO);

		MediaResponseDTO result = mediaCommandService.create(createDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, media.getUploadedAt());

		verify(mediaValidationService).validateRequest(createDTO.getRequestId());
		verify(mediaMapper).toEntity(createDTO);
		verify(mediaRepository).save(media);
		verify(mediaMapper).toResponse(media);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\media\MediaQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.media;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.mapper.MediaMapper;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;

@ExtendWith(MockitoExtension.class)
class MediaQueryServiceTest {

	@Mock
	private MediaRepository mediaRepository;

	@Mock
	private MediaValidationService mediaValidationService;

	@Mock
	private MediaMapper mediaMapper;

	@InjectMocks
	private MediaQueryService mediaQueryService;

	private Media media;
	private MediaResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		media = new Media();
		media.setId("media-id");
		media.setRequestId("request-id");

		responseDTO = new MediaResponseDTO();
		responseDTO.setId("media-id");
		responseDTO.setRequestId("request-id");
	}

	@Test
	void shouldFindAllMedia() {

		when(mediaRepository.findAll()).thenReturn(List.of(media));
		when(mediaMapper.toResponse(media)).thenReturn(responseDTO);

		List<MediaResponseDTO> result = mediaQueryService.findAll();
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(mediaRepository).findAll();
		verify(mediaMapper).toResponse(media);
	}

	@Test
	void shouldFindMediaByRequest() {

		doNothing().when(mediaValidationService).validateRequest("request-id");
		when(mediaRepository.findByRequestId("request-id")).thenReturn(List.of(media));
		when(mediaMapper.toResponse(media)).thenReturn(responseDTO);

		List<MediaResponseDTO> result = mediaQueryService.findByRequest("request-id");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(mediaValidationService).validateRequest("request-id");
		verify(mediaRepository).findByRequestId("request-id");
		verify(mediaMapper).toResponse(media);
	}

	@Test
	void shouldFindMediaById() {

		when(mediaValidationService.validateMediaExists("media-id")).thenReturn(media);
		when(mediaMapper.toResponse(media)).thenReturn(responseDTO);

		MediaResponseDTO result = mediaQueryService.findById("media-id");
		assertThat(result).isEqualTo(responseDTO);

		verify(mediaValidationService).validateMediaExists("media-id");
		verify(mediaMapper).toResponse(media);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\media\MediaValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.media;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@ExtendWith(MockitoExtension.class)
class MediaValidationServiceTest {

	@Mock
	private MediaRepository mediaRepository;

	@Mock
	private RequestRepository requestRepository;

	@InjectMocks
	private MediaValidationService mediaValidationService;

	private Media media;

	@BeforeEach
	void setUp() {
		media = new Media();
		media.setId("media-id");
	}

	@Test
	void shouldValidateRequest() {

		when(requestRepository.existsById("request-id")).thenReturn(true);
		assertDoesNotThrow(() -> mediaValidationService.validateRequest("request-id"));
	}

	@Test
	void shouldThrowWhenRequestDoesNotExist() {

		when(requestRepository.existsById("request-id")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> mediaValidationService.validateRequest("request-id"));
	}

	@Test
	void shouldReturnMediaWhenMediaExists() {

		when(mediaRepository.findById("media-id")).thenReturn(Optional.of(media));
		Media result = mediaValidationService.validateMediaExists("media-id");
		assertEquals(media, result);
	}

	@Test
	void shouldThrowWhenMediaDoesNotExist() {

		when(mediaRepository.findById("media-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> mediaValidationService.validateMediaExists("media-id"));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\request\RequestCommandServiceTest.java

```java
package com.iagomoreira.urbanflow.service.request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@ExtendWith(MockitoExtension.class)
class RequestCommandServiceTest {

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private UserRepository userRepository;

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private RequestValidationService requestValidationService;

	@Mock
	private SecurityService securityService;

	@Mock
	private RequestMapper requestMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private RequestCommandService requestCommandService;

	private CreateRequestDTO createDTO;
	private UpdateRequestDTO updateDTO;
	private Request request;
	private RequestResponseDTO responseDTO;
	private SubCategory subCategory;

	private final LocalDateTime now = LocalDateTime.of(2025, 1, 1, 10, 0);

	@BeforeEach
	void setUp() {

		createDTO = new CreateRequestDTO();
		createDTO.setCategoryId("category");
		createDTO.setSubCategoryId("subcategory");

		updateDTO = new UpdateRequestDTO();
		updateDTO.setTitle("Novo título");
		updateDTO.setDescription("Nova descrição");

		request = new Request();
		request.setId("request-id");

		subCategory = new SubCategory();
		subCategory.setDepartmentId("department-id");

		responseDTO = new RequestResponseDTO();
		responseDTO.setId("request-id");
	}

	@Test
	void shouldCreateRequest() {

		when(securityService.getAuthenticatedUserId()).thenReturn("user-id");
		doNothing().when(requestValidationService).validateAuthenticatedUser("user-id");

		when(requestValidationService.validateSubCategory(createDTO)).thenReturn(subCategory);
		when(requestMapper.toEntity(createDTO)).thenReturn(request);
		when(dateTimeProvider.now()).thenReturn(now);
		when(requestRepository.save(request)).thenReturn(request);
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		RequestResponseDTO result = requestCommandService.create(createDTO);

		assertEquals(responseDTO, result);
		assertEquals("user-id", request.getUserId());
		assertEquals("department-id", request.getDepartmentId());
		assertEquals(RequestStatus.RECEIVED, request.getStatus());
		assertEquals(now, request.getCreatedAt());
		assertEquals(now, request.getUpdatedAt());

		verify(requestRepository).save(request);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void shouldUpdateRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));

		doNothing().when(requestValidationService).validateRequestAccess(request);
		doNothing().when(requestValidationService).validateRequestEditable(request);

		when(dateTimeProvider.now()).thenReturn(now);
		when(requestRepository.save(request)).thenReturn(request);
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		RequestResponseDTO result = requestCommandService.update("request-id", updateDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, request.getUpdatedAt());

		verify(requestMapper).updateEntity(request, updateDTO);
		verify(requestRepository).save(request);
	}

	@Test
	void shouldThrowExceptionWhenUpdatingNonExistingRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> requestCommandService.update("request-id", updateDTO));

		verify(requestRepository, never()).save(any());
	}

	@Test
	void shouldDeleteRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));

		doNothing().when(requestValidationService).validateRequestAccess(request);
		doNothing().when(requestValidationService).validateRequestDeletion(request);

		requestCommandService.delete("request-id");
		verify(requestRepository).deleteById("request-id");
	}

	@Test
	void shouldThrowExceptionWhenDeletingNonExistingRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> requestCommandService.delete("request-id"));

		verify(requestRepository, never()).deleteById(any());
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\request\RequestQueryServiceBasicTest.java

```java
package com.iagomoreira.urbanflow.service.request;

import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.*;
import com.iagomoreira.urbanflow.service.security.SecurityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RequestQueryServiceBasicTest {

	@Mock
	private MongoTemplate mongoTemplate;
	@Mock
	private RequestRepository requestRepository;
	@Mock
	private UserRepository userRepository;
	@Mock
	private CategoryRepository categoryRepository;
	@Mock
	private DepartmentRepository departmentRepository;
	@Mock
	private SubCategoryRepository subCategoryRepository;
	@Mock
	private SecurityService securityService;
	@Mock
	private RequestValidationService requestValidationService;
	@Mock
	private RequestMapper requestMapper;

	@InjectMocks
	private RequestQueryService requestQueryService;

	private Request request;
	private RequestResponseDTO responseDTO;
	private final String requestId = "req123";
	private final String userId = "user456";
	private final String departmentId = "dept789";
	private final String categoryId = "cat123";
	private final String subCategoryId = "sub456";

	@BeforeEach
	void setUp() {
		request = new Request();
		request.setId(requestId);
		request.setUserId(userId);
		request.setDepartmentId(departmentId);
		request.setCategoryId(categoryId);
		request.setSubCategoryId(subCategoryId);

		responseDTO = new RequestResponseDTO();
		responseDTO.setId(requestId);
	}

	@Test
	void findAll_whenAdmin_shouldReturnAllRequests() {

		when(securityService.isAdmin()).thenReturn(true);
		when(requestRepository.findAll()).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findAll();
		assertThat(result).hasSize(1);

		verify(requestRepository).findAll();
		verify(requestMapper).toResponse(request);
		verify(securityService, never()).isOperator();
		verify(securityService, never()).getAuthenticatedDepartmentId();
		verify(securityService, never()).getAuthenticatedUserId();
	}

	@Test
	void findAll_whenOperator_shouldReturnRequestsByDepartment() {

		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(true);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn(departmentId);
		when(requestRepository.findByDepartmentId(departmentId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findAll();
		assertThat(result).hasSize(1);

		verify(requestRepository).findByDepartmentId(departmentId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findAll_whenCitizen_shouldReturnRequestsByUser() {

		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(false);
		when(securityService.getAuthenticatedUserId()).thenReturn(userId);
		when(requestRepository.findByUserId(userId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findAll();
		assertThat(result).hasSize(1);

		verify(requestRepository).findByUserId(userId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findById_whenRequestExistsAndAccessGranted_shouldReturnDTO() {

		when(requestRepository.findById(requestId)).thenReturn(Optional.of(request));
		doNothing().when(requestValidationService).validateRequestAccess(request);
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		RequestResponseDTO result = requestQueryService.findById(requestId);
		assertThat(result).isEqualTo(responseDTO);

		verify(requestRepository).findById(requestId);
		verify(requestValidationService).validateRequestAccess(request);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findById_whenRequestNotFound_shouldThrowResourceNotFoundException() {

		when(requestRepository.findById(requestId)).thenReturn(Optional.empty());
		assertThatThrownBy(() -> requestQueryService.findById(requestId)).isInstanceOf(ResourceNotFoundException.class)
				.hasMessage("Request not found");

		verify(requestRepository).findById(requestId);
		verifyNoInteractions(requestValidationService);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByStatus_shouldReturnRequestsWithGivenStatus() {

		RequestStatus status = RequestStatus.RECEIVED;

		when(requestRepository.findByStatus(status)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findByStatus(status);
		assertThat(result).hasSize(1);

		verify(requestRepository).findByStatus(status);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findByCategory_whenCategoryExists_shouldReturnRequests() {

		when(categoryRepository.existsById(categoryId)).thenReturn(true);
		when(requestRepository.findByCategoryId(categoryId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findByCategory(categoryId);
		assertThat(result).hasSize(1);

		verify(categoryRepository).existsById(categoryId);
		verify(requestRepository).findByCategoryId(categoryId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findByCategory_whenCategoryNotFound_shouldThrowResourceNotFoundException() {

		when(categoryRepository.existsById(categoryId)).thenReturn(false);
		assertThatThrownBy(() -> requestQueryService.findByCategory(categoryId))
				.isInstanceOf(ResourceNotFoundException.class).hasMessage("Category not found");

		verify(categoryRepository).existsById(categoryId);
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findBySubCategory_whenSubCategoryExists_shouldReturnRequests() {

		when(subCategoryRepository.existsById(subCategoryId)).thenReturn(true);
		when(requestRepository.findBySubCategoryId(subCategoryId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findBySubCategory(subCategoryId);
		assertThat(result).hasSize(1);

		verify(subCategoryRepository).existsById(subCategoryId);
		verify(requestRepository).findBySubCategoryId(subCategoryId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findBySubCategory_whenSubCategoryNotFound_shouldThrowResourceNotFoundException() {

		when(subCategoryRepository.existsById(subCategoryId)).thenReturn(false);
		assertThatThrownBy(() -> requestQueryService.findBySubCategory(subCategoryId))
				.isInstanceOf(ResourceNotFoundException.class).hasMessage("SubCategory not found");

		verify(subCategoryRepository).existsById(subCategoryId);
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByUser_whenUserExistsAndAccessGranted_shouldReturnRequests() {

		when(userRepository.existsById(userId)).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(false);
		when(requestRepository.findByUserId(userId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findByUser(userId);
		assertThat(result).hasSize(1);

		verify(userRepository).existsById(userId);
		verify(requestRepository).findByUserId(userId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findByUser_whenUserNotFound_shouldThrowResourceNotFoundException() {

		when(userRepository.existsById(userId)).thenReturn(false);
		assertThatThrownBy(() -> requestQueryService.findByUser(userId)).isInstanceOf(ResourceNotFoundException.class)
				.hasMessage("User not found");

		verify(userRepository).existsById(userId);
		verifyNoInteractions(securityService);
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByUser_whenCitizenAndDifferentUserId_shouldThrowBusinessException() {

		String anotherUserId = "anotherUser";

		when(userRepository.existsById(anotherUserId)).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(true);
		when(securityService.getAuthenticatedUserId()).thenReturn(userId); // logado é diferente de anotherUserId

		assertThatThrownBy(() -> requestQueryService.findByUser(anotherUserId)).isInstanceOf(BusinessException.class)
				.hasMessage("Access denied");

		verify(userRepository).existsById(anotherUserId);
		verify(securityService).isCitizen();
		verify(securityService).getAuthenticatedUserId();
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByDepartment_whenDepartmentExistsAndAccessGrantedForAdmin_shouldReturnRequests() {

		when(departmentRepository.existsById(departmentId)).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(false); // admin
		when(requestRepository.findByDepartmentId(departmentId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findByDepartment(departmentId);
		assertThat(result).hasSize(1);

		verify(departmentRepository).existsById(departmentId);
		verify(securityService).isCitizen();
		verify(securityService).isOperator();
		verify(requestRepository).findByDepartmentId(departmentId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findByDepartment_whenDepartmentNotFound_shouldThrowResourceNotFoundException() {

		when(departmentRepository.existsById(departmentId)).thenReturn(false);
		assertThatThrownBy(() -> requestQueryService.findByDepartment(departmentId))
				.isInstanceOf(ResourceNotFoundException.class).hasMessage("Department not found");

		verify(departmentRepository).existsById(departmentId);
		verifyNoInteractions(securityService);
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByDepartment_whenCitizen_shouldThrowBusinessException() {

		when(departmentRepository.existsById(departmentId)).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(true);

		assertThatThrownBy(() -> requestQueryService.findByDepartment(departmentId))
				.isInstanceOf(BusinessException.class).hasMessage("Access denied");

		verify(departmentRepository).existsById(departmentId);
		verify(securityService).isCitizen();
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByDepartment_whenOperatorAndDifferentDepartment_shouldThrowBusinessException() {

		String anotherDepartment = "anotherDept";

		when(departmentRepository.existsById(anotherDepartment)).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(true);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn(departmentId); // logado diferente

		assertThatThrownBy(() -> requestQueryService.findByDepartment(anotherDepartment))
				.isInstanceOf(BusinessException.class).hasMessage("Access denied");

		verify(departmentRepository).existsById(anotherDepartment);
		verify(securityService).isCitizen();
		verify(securityService).isOperator();
		verify(securityService).getAuthenticatedDepartmentId();
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\request\RequestQueryServiceSearchTest.java

```java
package com.iagomoreira.urbanflow.service.request;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@ExtendWith(MockitoExtension.class)
class RequestQueryServiceSearchTest {

	@Mock
	private MongoTemplate mongoTemplate;

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private UserRepository userRepository;

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private DepartmentRepository departmentRepository;

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private SecurityService securityService;

	@Mock
	private RequestValidationService requestValidationService;

	@Mock
	private RequestMapper requestMapper;

	@InjectMocks
	private RequestQueryService requestQueryService;

	private Request request;
	private RequestResponseDTO responseDTO;

	private final String userId = "user456";
	private final String departmentId = "dept789";
	private final String categoryId = "cat123";
	private final String subCategoryId = "sub456";
	private final RequestStatus status = RequestStatus.RECEIVED;

	@BeforeEach
	void setUp() {

		request = new Request();
		request.setId("req123");
		request.setUserId(userId);
		request.setDepartmentId(departmentId);
		request.setCategoryId(categoryId);
		request.setSubCategoryId(subCategoryId);
		request.setStatus(status);

		responseDTO = new RequestResponseDTO();
		responseDTO.setId("req123");
	}

	@Test
	void searchPaginated_whenAdmin_shouldApplyFiltersAndReturnPage() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(false);
		when(mongoTemplate.count(any(Query.class), eq(Request.class))).thenReturn(1L);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		Page<RequestResponseDTO> result = requestQueryService.search(status, categoryId, subCategoryId, departmentId,
				userId, 0, 10, "createdAt", "asc");
		assertThat(result.getContent()).hasSize(1);
		assertThat(result.getTotalElements()).isEqualTo(1);

		verify(mongoTemplate).count(any(Query.class), eq(Request.class));
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchPaginated_whenOperator_shouldOverrideDepartmentIdAndIgnoreUserId() {

		when(securityService.isOperator()).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(false);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn(departmentId);
		when(mongoTemplate.count(any(Query.class), eq(Request.class))).thenReturn(1L);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		requestQueryService.search(status, categoryId, subCategoryId, "wrongDept", "wrongUser", 0, 10, "createdAt",
				"asc");

		verify(securityService).getAuthenticatedDepartmentId();
		verify(mongoTemplate).count(any(Query.class), eq(Request.class));
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchPaginated_whenCitizen_shouldOverrideUserIdAndIgnoreDepartment() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(true);
		when(securityService.getAuthenticatedUserId()).thenReturn(userId);
		when(mongoTemplate.count(any(Query.class), eq(Request.class))).thenReturn(1L);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		requestQueryService.search(status, categoryId, subCategoryId, "wrongDept", "wrongUser", 0, 10, "createdAt",
				"asc");

		verify(securityService).getAuthenticatedUserId();
		verify(mongoTemplate).count(any(Query.class), eq(Request.class));
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchPaginated_withInvalidSortField_shouldFallbackToCreatedAt() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(false);
		when(mongoTemplate.count(any(Query.class), eq(Request.class))).thenReturn(1L);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		Page<RequestResponseDTO> result = requestQueryService.search(status, categoryId, subCategoryId, departmentId,
				userId, 0, 10, "invalidField", "desc");
		assertThat(result.getContent()).hasSize(1);

		verify(mongoTemplate).count(any(Query.class), eq(Request.class));
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchUnpaged_whenAdmin_shouldReturnListWithFilters() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(false);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.search(status, categoryId, subCategoryId, departmentId,
				userId);
		assertThat(result).hasSize(1);

		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchUnpaged_whenOperator_shouldOverrideDepartment() {

		when(securityService.isOperator()).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(false);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn(departmentId);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		requestQueryService.search(status, categoryId, subCategoryId, "wrongDept", "wrongUser");

		verify(securityService).getAuthenticatedDepartmentId();
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchUnpaged_whenCitizen_shouldOverrideUser() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(true);
		when(securityService.getAuthenticatedUserId()).thenReturn(userId);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		requestQueryService.search(status, categoryId, subCategoryId, "wrongDept", "wrongUser");

		verify(securityService).getAuthenticatedUserId();
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchUnpaged_withNoFilters_shouldReturnAll() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(false);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.search(null, null, null, null, null);
		assertThat(result).hasSize(1);

		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\request\RequestValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.request;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.security.AuthorizationService;

@ExtendWith(MockitoExtension.class)
class RequestValidationServiceTest {

	@Mock
	private AuthorizationService authorizationService;

	@Mock
	private UserRepository userRepository;

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@InjectMocks
	private RequestValidationService requestValidationService;

	@Test
	void shouldAllowReceivedToUnderReview() {
		assertDoesNotThrow(() -> requestValidationService.validateStatusTransition(RequestStatus.RECEIVED,
				RequestStatus.UNDER_REVIEW));
	}

	@Test
	void shouldThrowWhenStatusTransitionIsInvalid() {
		assertThrows(BusinessException.class, () -> requestValidationService
				.validateStatusTransition(RequestStatus.RECEIVED, RequestStatus.RESOLVED));
	}

	@Test
	void shouldThrowWhenRequestAlreadyFinalized() {
		assertThrows(BusinessException.class, () -> requestValidationService
				.validateStatusTransition(RequestStatus.RESOLVED, RequestStatus.IN_PROGRESS));
	}

	@Test
	void shouldValidateRequestAccess() {

		Request request = new Request();
		requestValidationService.validateRequestAccess(request);
		verify(authorizationService).validateRequestAccess(request);
	}

	@Test
	void shouldValidateAuthenticatedUser() {

		when(userRepository.existsById("user-id")).thenReturn(true);
		assertDoesNotThrow(() -> requestValidationService.validateAuthenticatedUser("user-id"));
	}

	@Test
	void shouldThrowWhenAuthenticatedUserDoesNotExist() {

		when(userRepository.existsById("user-id")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class,
				() -> requestValidationService.validateAuthenticatedUser("user-id"));
	}

	@Test
	void shouldValidateSubCategory() {

		CreateRequestDTO dto = new CreateRequestDTO();
		dto.setCategoryId("category-id");
		dto.setSubCategoryId("subcategory-id");

		SubCategory subCategory = new SubCategory();
		subCategory.setCategoryId("category-id");

		when(subCategoryRepository.findById("subcategory-id")).thenReturn(Optional.of(subCategory));
		SubCategory result = requestValidationService.validateSubCategory(dto);

		assertEquals(subCategory, result);
	}

	@Test
	void shouldThrowWhenSubCategoryDoesNotExist() {

		CreateRequestDTO dto = new CreateRequestDTO();
		dto.setSubCategoryId("subcategory-id");

		when(subCategoryRepository.findById("subcategory-id")).thenReturn(Optional.empty());

		assertThrows(ResourceNotFoundException.class, () -> requestValidationService.validateSubCategory(dto));
	}

	@Test
	void shouldThrowWhenSubCategoryDoesNotBelongToCategory() {

		CreateRequestDTO dto = new CreateRequestDTO();
		dto.setCategoryId("category-1");
		dto.setSubCategoryId("subcategory-id");

		SubCategory subCategory = new SubCategory();
		subCategory.setCategoryId("category-2");

		when(subCategoryRepository.findById("subcategory-id")).thenReturn(Optional.of(subCategory));
		assertThrows(BusinessException.class, () -> requestValidationService.validateSubCategory(dto));
	}

	@Test
	void shouldThrowWhenEditingResolvedRequest() {

		Request request = new Request();
		request.setStatus(RequestStatus.RESOLVED);

		assertThrows(BusinessException.class, () -> requestValidationService.validateRequestEditable(request));
	}

	@Test
	void shouldThrowWhenDeletingResolvedRequest() {

		Request request = new Request();
		request.setStatus(RequestStatus.RESOLVED);

		assertThrows(BusinessException.class, () -> requestValidationService.validateRequestDeletion(request));
	}

	@Test
	void shouldThrowWhenEditingCancelledRequest() {

		Request request = new Request();
		request.setStatus(RequestStatus.CANCELLED);

		assertThrows(BusinessException.class, () -> requestValidationService.validateRequestEditable(request));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\requesthistory\RequestHistoryQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.requesthistory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.RequestHistoryMapper;
import com.iagomoreira.urbanflow.model.RequestHistory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestHistoryRepository;

@ExtendWith(MockitoExtension.class)
class RequestHistoryQueryServiceTest {

	@Mock
	private RequestHistoryRepository requestHistoryRepository;

	@Mock
	private RequestHistoryValidationService requestHistoryValidationService;

	@Mock
	private RequestHistoryMapper requestHistoryMapper;

	@InjectMocks
	private RequestHistoryQueryService requestHistoryQueryService;

	private RequestHistory history;
	private RequestHistoryResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		history = new RequestHistory();
		history.setId("history-id");
		history.setRequestId("request-id");
		history.setOldStatus(RequestStatus.RECEIVED);
		history.setNewStatus(RequestStatus.UNDER_REVIEW);
		history.setChangedAt(LocalDateTime.now());

		responseDTO = new RequestHistoryResponseDTO();
		responseDTO.setId("history-id");
		responseDTO.setOldStatus(RequestStatus.RECEIVED);
		responseDTO.setNewStatus(RequestStatus.UNDER_REVIEW);
		responseDTO.setChangedAt(history.getChangedAt());
	}

	@Test
	void shouldFindRequestHistoryByRequest() {

		doNothing().when(requestHistoryValidationService).validateRequest("request-id");
		when(requestHistoryRepository.findByRequestIdOrderByChangedAtAsc("request-id")).thenReturn(List.of(history));
		when(requestHistoryMapper.toResponse(history)).thenReturn(responseDTO);

		List<RequestHistoryResponseDTO> result = requestHistoryQueryService.findByRequest("request-id");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(requestHistoryValidationService).validateRequest("request-id");
		verify(requestHistoryRepository).findByRequestIdOrderByChangedAtAsc("request-id");
		verify(requestHistoryMapper).toResponse(history);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\requesthistory\RequestHistoryValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.requesthistory;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@ExtendWith(MockitoExtension.class)
class RequestHistoryValidationServiceTest {

	@Mock
	private RequestRepository requestRepository;

	@InjectMocks
	private RequestHistoryValidationService requestHistoryValidationService;

	@Test
	void shouldValidateRequest() {

		when(requestRepository.existsById("request-id")).thenReturn(true);
		assertDoesNotThrow(() -> requestHistoryValidationService.validateRequest("request-id"));
	}

	@Test
	void shouldThrowWhenRequestDoesNotExist() {

		when(requestRepository.existsById("request-id")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class,
				() -> requestHistoryValidationService.validateRequest("request-id"));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\security\AuthorizationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.security;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.model.Request;

@ExtendWith(MockitoExtension.class)
class AuthorizationServiceTest {

	@Mock
	private SecurityService securityService;

	@InjectMocks
	private AuthorizationService authorizationService;

	private Request request;
	private final String departmentId = "dep-123";
	private final String userId = "user-456";

	@BeforeEach
	void setUp() {
		request = new Request();
		request.setDepartmentId(departmentId);
		request.setUserId(userId);
	}

	@Test
	void validateRequestAccess_shouldAllowAdminAccess() {
		when(securityService.isAdmin()).thenReturn(true);

		assertDoesNotThrow(() -> authorizationService.validateRequestAccess(request));
	}

	@Test
	void validateRequestAccess_shouldAllowOperatorWhenSameDepartment() {
		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(true);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn(departmentId);

		assertDoesNotThrow(() -> authorizationService.validateRequestAccess(request));
	}

	@Test
	void validateRequestAccess_shouldThrowBusinessExceptionWhenOperatorDifferentDepartment() {
		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(true);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn("other-dept");

		assertThrows(BusinessException.class, () -> authorizationService.validateRequestAccess(request),
				"Access denied");
	}

	@Test
	void validateRequestAccess_shouldAllowCitizenWhenSameUser() {
		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(true);
		when(securityService.getAuthenticatedUserId()).thenReturn(userId);

		assertDoesNotThrow(() -> authorizationService.validateRequestAccess(request));
	}

	@Test
	void validateRequestAccess_shouldThrowBusinessExceptionWhenCitizenDifferentUser() {
		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(true);
		when(securityService.getAuthenticatedUserId()).thenReturn("other-user");

		assertThrows(BusinessException.class, () -> authorizationService.validateRequestAccess(request),
				"Access denied");
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\subcategory\SubCategoryCommandServiceTest.java

```java
package com.iagomoreira.urbanflow.service.subcategory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.mapper.SubCategoryMapper;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@ExtendWith(MockitoExtension.class)
class SubCategoryCommandServiceTest {

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private SubCategoryValidationService subCategoryValidationService;

	@Mock
	private SubCategoryMapper subCategoryMapper;

	@InjectMocks
	private SubCategoryCommandService subCategoryCommandService;

	private SubCategory subCategory;
	private SubCategoryResponseDTO responseDTO;
	private CreateSubCategoryDTO createDTO;
	private UpdateSubCategoryDTO updateDTO;

	@BeforeEach
	void setUp() {

		createDTO = new CreateSubCategoryDTO();
		createDTO.setName("Buracos");
		createDTO.setDescription("Buracos em vias");
		createDTO.setCategoryId("category-id");
		createDTO.setDepartmentId("department-id");

		updateDTO = new UpdateSubCategoryDTO();
		updateDTO.setName("Buracos Atualizado");
		updateDTO.setDescription("Descrição Atualizada");
		updateDTO.setCategoryId("category-id");
		updateDTO.setDepartmentId("department-id");

		subCategory = new SubCategory();
		subCategory.setId("subcategory-id");
		subCategory.setName("Buracos");
		subCategory.setDescription("Buracos em vias");
		subCategory.setCategoryId("category-id");
		subCategory.setDepartmentId("department-id");

		responseDTO = new SubCategoryResponseDTO();
		responseDTO.setId("subcategory-id");
		responseDTO.setName("Buracos");
		responseDTO.setDescription("Buracos em vias");
		responseDTO.setCategoryId("category-id");
		responseDTO.setDepartmentId("department-id");
	}

	@Test
	void shouldCreateSubCategory() {

		doNothing().when(subCategoryValidationService).validateCategoryExists(createDTO.getCategoryId());
		doNothing().when(subCategoryValidationService).validateDepartmentExists(createDTO.getDepartmentId());

		when(subCategoryMapper.toEntity(createDTO)).thenReturn(subCategory);
		when(subCategoryRepository.save(subCategory)).thenReturn(subCategory);
		when(subCategoryMapper.toResponse(subCategory)).thenReturn(responseDTO);

		SubCategoryResponseDTO result = subCategoryCommandService.create(createDTO);

		assertEquals(responseDTO, result);

		verify(subCategoryValidationService).validateCategoryExists(createDTO.getCategoryId());
		verify(subCategoryValidationService).validateDepartmentExists(createDTO.getDepartmentId());
		verify(subCategoryMapper).toEntity(createDTO);
		verify(subCategoryRepository).save(subCategory);
		verify(subCategoryMapper).toResponse(subCategory);
	}

	@Test
	void shouldUpdateSubCategory() {

		when(subCategoryValidationService.validateSubCategoryExists("subcategory-id")).thenReturn(subCategory);

		doNothing().when(subCategoryValidationService).validateCategoryExists(updateDTO.getCategoryId());
		doNothing().when(subCategoryValidationService).validateDepartmentExists(updateDTO.getDepartmentId());

		when(subCategoryRepository.save(subCategory)).thenReturn(subCategory);
		when(subCategoryMapper.toResponse(subCategory)).thenReturn(responseDTO);

		SubCategoryResponseDTO result = subCategoryCommandService.update("subcategory-id", updateDTO);

		assertEquals(responseDTO, result);

		verify(subCategoryValidationService).validateSubCategoryExists("subcategory-id");
		verify(subCategoryValidationService).validateCategoryExists(updateDTO.getCategoryId());
		verify(subCategoryValidationService).validateDepartmentExists(updateDTO.getDepartmentId());
		verify(subCategoryMapper).updateEntity(subCategory, updateDTO);
		verify(subCategoryRepository).save(subCategory);
		verify(subCategoryMapper).toResponse(subCategory);
	}

	@Test
	void shouldDeleteSubCategory() {

		when(subCategoryValidationService.validateSubCategoryExists("subcategory-id")).thenReturn(subCategory);
		subCategoryCommandService.delete("subcategory-id");

		verify(subCategoryValidationService).validateSubCategoryExists("subcategory-id");
		verify(subCategoryRepository).deleteById("subcategory-id");
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\subcategory\SubCategoryQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.subcategory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.SubCategoryMapper;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@ExtendWith(MockitoExtension.class)
class SubCategoryQueryServiceTest {

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private SubCategoryValidationService subCategoryValidationService;

	@Mock
	private SubCategoryMapper subCategoryMapper;

	@InjectMocks
	private SubCategoryQueryService subCategoryQueryService;

	private SubCategory subCategory;
	private SubCategoryResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		subCategory = new SubCategory();
		subCategory.setId("subcategory-id");
		subCategory.setName("Buraco");
		subCategory.setDescription("Buracos em vias públicas");
		subCategory.setCategoryId("category-id");
		subCategory.setDepartmentId("department-id");

		responseDTO = new SubCategoryResponseDTO();
		responseDTO.setId("subcategory-id");
		responseDTO.setName("Buraco");
		responseDTO.setDescription("Buracos em vias públicas");
		responseDTO.setCategoryId("category-id");
		responseDTO.setDepartmentId("department-id");
	}

	@Test
	void shouldFindAllSubCategories() {

		when(subCategoryRepository.findAll()).thenReturn(List.of(subCategory));
		when(subCategoryMapper.toResponse(subCategory)).thenReturn(responseDTO);

		List<SubCategoryResponseDTO> result = subCategoryQueryService.findAll();

		assertEquals(1, result.size());
		assertEquals(responseDTO, result.get(0));

		verify(subCategoryRepository).findAll();
		verify(subCategoryMapper).toResponse(subCategory);
	}

	@Test
	void shouldFindSubCategoryById() {

		when(subCategoryValidationService.validateSubCategoryExists("subcategory-id")).thenReturn(subCategory);
		when(subCategoryMapper.toResponse(subCategory)).thenReturn(responseDTO);

		SubCategoryResponseDTO result = subCategoryQueryService.findById("subcategory-id");
		assertEquals(responseDTO, result);

		verify(subCategoryValidationService).validateSubCategoryExists("subcategory-id");
		verify(subCategoryMapper).toResponse(subCategory);
	}

	@Test
	void shouldFindSubCategoriesByCategory() {

		when(subCategoryRepository.findByCategoryId("category-id")).thenReturn(List.of(subCategory));
		when(subCategoryMapper.toResponse(subCategory)).thenReturn(responseDTO);

		List<SubCategoryResponseDTO> result = subCategoryQueryService.findByCategory("category-id");

		assertEquals(1, result.size());
		assertEquals(responseDTO, result.get(0));

		verify(subCategoryValidationService).validateCategoryExists("category-id");
		verify(subCategoryRepository).findByCategoryId("category-id");
		verify(subCategoryMapper).toResponse(subCategory);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\subcategory\SubCategoryValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.subcategory;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@ExtendWith(MockitoExtension.class)
class SubCategoryValidationServiceTest {

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private DepartmentRepository departmentRepository;

	@InjectMocks
	private SubCategoryValidationService subCategoryValidationService;

	private SubCategory subCategory;

	@BeforeEach
	void setup() {
		subCategory = new SubCategory();
		subCategory.setId("1");
		subCategory.setName("Buracos");
	}

	@Test
	void shouldReturnSubCategoryWhenSubCategoryExists() {

		when(subCategoryRepository.findById("1")).thenReturn(Optional.of(subCategory));
		SubCategory result = subCategoryValidationService.validateSubCategoryExists("1");
		assertEquals(subCategory, result);
	}

	@Test
	void shouldThrowResourceNotFoundWhenSubCategoryDoesNotExist() {

		when(subCategoryRepository.findById("1")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class,
				() -> subCategoryValidationService.validateSubCategoryExists("1"));
	}

	@Test
	void shouldNotThrowExceptionWhenCategoryExists() {

		when(categoryRepository.existsById("10")).thenReturn(true);
		assertDoesNotThrow(() -> subCategoryValidationService.validateCategoryExists("10"));
	}

	@Test
	void shouldThrowResourceNotFoundWhenCategoryDoesNotExist() {

		when(categoryRepository.existsById("10")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> subCategoryValidationService.validateCategoryExists("10"));
	}

	@Test
	void shouldNotThrowExceptionWhenDepartmentExists() {

		when(departmentRepository.existsById("20")).thenReturn(true);
		assertDoesNotThrow(() -> subCategoryValidationService.validateDepartmentExists("20"));
	}

	@Test
	void shouldThrowResourceNotFoundWhenDepartmentDoesNotExist() {

		when(departmentRepository.existsById("20")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class,
				() -> subCategoryValidationService.validateDepartmentExists("20"));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\update\UpdateCommandServiceTest.java

```java
package com.iagomoreira.urbanflow.service.update;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.mapper.UpdateMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Update;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UpdateRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@ExtendWith(MockitoExtension.class)
class UpdateCommandServiceTest {

	@Mock
	private UpdateRepository updateRepository;

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private UpdateValidationService updateValidationService;

	@Mock
	private UpdateMapper updateMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private UpdateCommandService updateCommandService;

	private CreateUpdateDTO createDTO;
	private Update update;
	private Request request;
	private UpdateResponseDTO responseDTO;

	private final LocalDateTime now = LocalDateTime.of(2025, 1, 1, 10, 0);

	@BeforeEach
	void setUp() {

		createDTO = new CreateUpdateDTO();
		createDTO.setRequestId("request-id");
		createDTO.setDescription("Equipe enviada ao local.");
		createDTO.setStatus(RequestStatus.IN_PROGRESS);

		request = new Request();
		request.setId("request-id");
		request.setStatus(RequestStatus.APPROVED);

		update = new Update();
		update.setId("update-id");
		update.setRequestId("request-id");
		update.setDescription("Equipe enviada ao local.");
		update.setStatus(RequestStatus.IN_PROGRESS);

		responseDTO = new UpdateResponseDTO();
		responseDTO.setId("update-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setDescription("Equipe enviada ao local.");
		responseDTO.setStatus(RequestStatus.IN_PROGRESS);
		responseDTO.setUpdatedAt(now);
	}

	@Test
	void shouldCreateUpdate() {

		when(updateValidationService.validateRequest(createDTO.getRequestId())).thenReturn(request);
		when(updateMapper.toEntity(createDTO)).thenReturn(update);
		when(dateTimeProvider.now()).thenReturn(now);
		when(updateRepository.save(update)).thenReturn(update);
		when(updateMapper.toResponse(update)).thenReturn(responseDTO);

		UpdateResponseDTO result = updateCommandService.create(createDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, update.getUpdatedAt());
		assertEquals(RequestStatus.IN_PROGRESS, request.getStatus());
		assertEquals(now, request.getUpdatedAt());

		verify(updateValidationService).validateRequest(createDTO.getRequestId());
		verify(updateMapper).toEntity(createDTO);
		verify(updateRepository).save(update);
		verify(requestRepository).save(request);
		verify(updateMapper).toResponse(update);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\update\UpdateQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.update;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.mapper.UpdateMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Update;
import com.iagomoreira.urbanflow.repository.UpdateRepository;

@ExtendWith(MockitoExtension.class)
class UpdateQueryServiceTest {

	@Mock
	private UpdateRepository updateRepository;

	@Mock
	private UpdateValidationService updateValidationService;

	@Mock
	private UpdateMapper updateMapper;

	@InjectMocks
	private UpdateQueryService updateQueryService;

	private Update update;
	private UpdateResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		update = new Update();
		update.setId("update-id");
		update.setRequestId("request-id");
		update.setDescription("Status atualizado");
		update.setUpdatedAt(LocalDateTime.now());

		responseDTO = new UpdateResponseDTO();
		responseDTO.setId("update-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setDescription("Status atualizado");
		responseDTO.setUpdatedAt(update.getUpdatedAt());
	}

	@Test
	void findAll_shouldReturnAllUpdates() {

		when(updateRepository.findAll()).thenReturn(List.of(update));
		when(updateMapper.toResponse(update)).thenReturn(responseDTO);

		List<UpdateResponseDTO> result = updateQueryService.findAll();
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(updateRepository).findAll();
		verify(updateMapper).toResponse(update);
	}

	@Test
	void findByRequest_shouldReturnUpdatesFromRequest() {

		Request requestMock = mock(Request.class);

		when(updateValidationService.validateRequest("request-id")).thenReturn(requestMock);
		when(updateRepository.findByRequestIdOrderByUpdatedAtAsc("request-id")).thenReturn(List.of(update));
		when(updateMapper.toResponse(update)).thenReturn(responseDTO);

		List<UpdateResponseDTO> result = updateQueryService.findByRequest("request-id");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(updateValidationService).validateRequest("request-id");
		verify(updateRepository).findByRequestIdOrderByUpdatedAtAsc("request-id");
		verify(updateMapper).toResponse(update);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\update\UpdateValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.update;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@ExtendWith(MockitoExtension.class)
class UpdateValidationServiceTest {

	@Mock
	private RequestRepository requestRepository;

	@InjectMocks
	private UpdateValidationService updateValidationService;

	private Request request;

	@BeforeEach
	void setUp() {
		request = new Request();
		request.setId("request-id");
	}

	@Test
	void shouldReturnRequestWhenRequestExists() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));
		Request result = updateValidationService.validateRequest("request-id");
		assertEquals(request, result);
	}

	@Test
	void shouldThrowWhenRequestDoesNotExist() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> updateValidationService.validateRequest("request-id"));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\user\UserCommandServiceTest.java

```java
package com.iagomoreira.urbanflow.service.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@ExtendWith(MockitoExtension.class)
class UserCommandServiceTest {

	@Mock
	private UserRepository userRepository;

	@Mock
	private PasswordEncoder passwordEncoder;

	@Mock
	private UserValidationService userValidationService;

	@Mock
	private UserMapper userMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private UserCommandService service;

	@Test
	void shouldCreateUser() {

		CreateUserDTO dto = new CreateUserDTO();

		User entity = new User();
		User saved = new User();
		UserResponseDTO response = new UserResponseDTO();

		LocalDateTime now = LocalDateTime.now();

		when(passwordEncoder.encode(any())).thenReturn("encoded");
		when(userMapper.toEntity(dto, "encoded")).thenReturn(entity);
		when(dateTimeProvider.now()).thenReturn(now);
		when(userRepository.save(entity)).thenReturn(saved);
		when(userMapper.toResponse(saved)).thenReturn(response);

		UserResponseDTO result = service.create(dto);

		verify(userValidationService).validateEmailAlreadyExists(dto.getEmail());
		verify(userValidationService).validateCpfAlreadyExists(dto.getCpf());
		verify(passwordEncoder).encode(dto.getPassword());

		assertEquals(Role.CITIZEN, entity.getRole());
		assertNull(entity.getDepartmentId());
		assertEquals(now, entity.getCreatedAt());

		verify(userRepository).save(entity);
		assertEquals(response, result);
	}

	@Test
	void shouldUpdateUser() {

		String id = "1";

		UpdateUserDTO dto = new UpdateUserDTO();
		dto.setPassword("123");

		User user = new User();
		UserResponseDTO response = new UserResponseDTO();

		LocalDateTime now = LocalDateTime.now();

		when(userValidationService.validateUserExists(id)).thenReturn(user);
		when(passwordEncoder.encode("123")).thenReturn("encoded");
		when(dateTimeProvider.now()).thenReturn(now);
		when(userRepository.save(user)).thenReturn(user);
		when(userMapper.toResponse(user)).thenReturn(response);

		UserResponseDTO result = service.update(id, dto);

		verify(userValidationService).validateEmailForUpdate(user, dto.getEmail());
		verify(userMapper).updateEntity(user, dto);
		verify(passwordEncoder).encode("123");

		assertEquals(now, user.getUpdatedAt());
		verify(userRepository).save(user);
		assertEquals(response, result);
	}

	@Test
	void shouldUpdateWithoutChangingPassword() {

		String id = "1";

		UpdateUserDTO dto = new UpdateUserDTO();

		User user = new User();

		when(userValidationService.validateUserExists(id)).thenReturn(user);
		when(dateTimeProvider.now()).thenReturn(LocalDateTime.now());
		when(userRepository.save(user)).thenReturn(user);
		when(userMapper.toResponse(user)).thenReturn(new UserResponseDTO());

		service.update(id, dto);
		verify(passwordEncoder, never()).encode(anyString());
	}

	@Test
	void shouldNotEncodeBlankPassword() {

		String id = "1";

		UpdateUserDTO dto = new UpdateUserDTO();
		dto.setPassword("   ");

		User user = new User();

		when(userValidationService.validateUserExists(id)).thenReturn(user);
		when(dateTimeProvider.now()).thenReturn(LocalDateTime.now());
		when(userRepository.save(user)).thenReturn(user);
		when(userMapper.toResponse(user)).thenReturn(new UserResponseDTO());

		service.update(id, dto);
		verify(passwordEncoder, never()).encode(anyString());
	}

	@Test
	void shouldDeleteUser() {

		String id = "1";

		User user = new User();

		when(userValidationService.validateUserExists(id)).thenReturn(user);

		service.delete(id);
		verify(userRepository).deleteById(id);
	}
}

```

# src\test\java\com\iagomoreira\urbanflow\service\user\UserQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class UserQueryServiceTest {

	@Mock
	private UserRepository userRepository;

	@Mock
	private UserValidationService userValidationService;

	@Mock
	private UserMapper userMapper;

	@InjectMocks
	private UserQueryService userQueryService;

	private User user;
	private UserResponseDTO userResponseDTO;

	@BeforeEach
	void setUp() {
		user = new User();
		user.setId("user-id");
		user.setName("Iago");
		user.setEmail("iago@email.com");
		user.setRole(Role.OPERATOR);
		user.setDepartmentId("department-id");

		userResponseDTO = new UserResponseDTO();
		userResponseDTO.setId(user.getId());
		userResponseDTO.setName(user.getName());
		userResponseDTO.setEmail(user.getEmail());
		userResponseDTO.setRole(user.getRole());
		userResponseDTO.setDepartmentId(user.getDepartmentId());
	}

	@Test
	void shouldFindUserById() {

		when(userRepository.findById("user-id")).thenReturn(Optional.of(user));
		when(userMapper.toResponse(user)).thenReturn(userResponseDTO);

		UserResponseDTO response = userQueryService.findById("user-id");

		assertEquals(user.getId(), response.getId());
		assertEquals(user.getName(), response.getName());

		verify(userRepository).findById("user-id");
		verify(userMapper).toResponse(user);
	}

	@Test
	void shouldThrowWhenUserNotFound() {

		when(userRepository.findById("user-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> userQueryService.findById("user-id"));

		verify(userRepository).findById("user-id");
		verifyNoInteractions(userMapper);
	}

	@Test
	void shouldFindAllUsers() {

		when(userRepository.findAll()).thenReturn(List.of(user));
		when(userMapper.toResponse(user)).thenReturn(userResponseDTO);

		List<UserResponseDTO> response = userQueryService.findAll();
		assertEquals(1, response.size());
		assertEquals(user.getId(), response.get(0).getId());

		verify(userRepository).findAll();
		verify(userMapper).toResponse(user);
	}

	@Test
	void shouldFindOperatorsByDepartment() {

		doNothing().when(userValidationService).validateDepartmentExists("department-id");
		when(userRepository.findByRoleAndDepartmentId(Role.OPERATOR, "department-id")).thenReturn(List.of(user));
		when(userMapper.toResponse(user)).thenReturn(userResponseDTO);

		List<UserResponseDTO> response = userQueryService.findOperatorsByDepartment("department-id");
		assertEquals(1, response.size());
		assertEquals(user.getId(), response.get(0).getId());

		verify(userValidationService).validateDepartmentExists("department-id");
		verify(userRepository).findByRoleAndDepartmentId(Role.OPERATOR, "department-id");
		verify(userMapper).toResponse(user);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\user\UserValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.user;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class UserValidationServiceTest {

	@Mock
	private UserRepository userRepository;

	@Mock
	private DepartmentRepository departmentRepository;

	@InjectMocks
	private UserValidationService userValidationService;

	private User user;

	@BeforeEach
	void setup() {
		user = new User();
		user.setId("1");
		user.setEmail("teste@email.com");
	}

	@Test
	void shouldNotThrowExceptionWhenEmailDoesNotExist() {

		when(userRepository.existsByEmail("teste@email.com")).thenReturn(false);
		assertDoesNotThrow(() -> userValidationService.validateEmailAlreadyExists("teste@email.com"));
	}

	@Test
	void shouldThrowBusinessExceptionWhenEmailAlreadyExists() {

		when(userRepository.existsByEmail("teste@email.com")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> userValidationService.validateEmailAlreadyExists("teste@email.com"));
	}

	@Test
	void shouldNotThrowExceptionWhenCpfDoesNotExist() {

		when(userRepository.existsByCpf("123")).thenReturn(false);
		assertDoesNotThrow(() -> userValidationService.validateCpfAlreadyExists("123"));
	}

	@Test
	void shouldThrowBusinessExceptionWhenCpfAlreadyExists() {

		when(userRepository.existsByCpf("123")).thenReturn(true);
		assertThrows(BusinessException.class, () -> userValidationService.validateCpfAlreadyExists("123"));
	}

	@Test
	void shouldReturnUserWhenUserExists() {

		when(userRepository.findById("1")).thenReturn(Optional.of(user));
		User result = userValidationService.validateUserExists("1");
		org.junit.jupiter.api.Assertions.assertEquals(user, result);
	}

	@Test
	void shouldThrowResourceNotFoundWhenUserDoesNotExist() {

		when(userRepository.findById("1")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> userValidationService.validateUserExists("1"));
	}

	@Test
	void shouldNotThrowExceptionWhenUpdatingWithSameEmail() {
		assertDoesNotThrow(() -> userValidationService.validateEmailForUpdate(user, "teste@email.com"));
	}

	@Test
	void shouldNotThrowExceptionWhenNewEmailIsAvailable() {

		when(userRepository.existsByEmail("novo@email.com")).thenReturn(false);
		assertDoesNotThrow(() -> userValidationService.validateEmailForUpdate(user, "novo@email.com"));
	}

	@Test
	void shouldThrowBusinessExceptionWhenUpdatingToExistingEmail() {

		when(userRepository.existsByEmail("novo@email.com")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> userValidationService.validateEmailForUpdate(user, "novo@email.com"));
	}

	@Test
	void shouldIgnoreDepartmentValidationForCitizen() {
		assertDoesNotThrow(() -> userValidationService.validateDepartment(Role.CITIZEN, null));
	}

	@Test
	void shouldIgnoreDepartmentValidationForAdmin() {
		assertDoesNotThrow(() -> userValidationService.validateDepartment(Role.ADMIN, null));
	}

	@Test
	void shouldThrowExceptionWhenOperatorHasNoDepartment() {
		assertThrows(BusinessException.class, () -> userValidationService.validateDepartment(Role.OPERATOR, null));
	}

	@Test
	void shouldThrowExceptionWhenDepartmentDoesNotExist() {

		when(departmentRepository.existsById("10")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class,
				() -> userValidationService.validateDepartment(Role.OPERATOR, "10"));
	}

	@Test
	void shouldAcceptOperatorWithValidDepartment() {

		when(departmentRepository.existsById("10")).thenReturn(true);
		assertDoesNotThrow(() -> userValidationService.validateDepartment(Role.OPERATOR, "10"));
	}

	@Test
	void shouldNotThrowWhenDepartmentExists() {

		when(departmentRepository.existsById("1")).thenReturn(true);
		assertDoesNotThrow(() -> userValidationService.validateDepartmentExists("1"));
	}

	@Test
	void shouldThrowWhenDepartmentDoesNotExist() {

		when(departmentRepository.existsById("1")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> userValidationService.validateDepartmentExists("1"));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\vote\VoteCommandServiceTest.java

```java
package com.iagomoreira.urbanflow.service.vote;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.mapper.VoteMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.repository.VoteRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@ExtendWith(MockitoExtension.class)
class VoteCommandServiceTest {

	@Mock
	private VoteRepository voteRepository;

	@Mock
	private VoteValidationService voteValidationService;

	@Mock
	private SecurityService securityService;

	@Mock
	private VoteMapper voteMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private VoteCommandService voteCommandService;

	private CreateVoteDTO createDTO;
	private Vote vote;
	private VoteResponseDTO responseDTO;

	private final LocalDateTime now = LocalDateTime.of(2025, 1, 1, 10, 0);

	@BeforeEach
	void setUp() {

		createDTO = new CreateVoteDTO();
		createDTO.setRequestId("request-id");
		createDTO.setPriorityLevel(PriorityLevel.HIGH);

		vote = new Vote();
		vote.setId("vote-id");
		vote.setUserId("user-id");
		vote.setRequestId("request-id");
		vote.setPriorityLevel(PriorityLevel.HIGH);

		responseDTO = new VoteResponseDTO();
		responseDTO.setId("vote-id");
		responseDTO.setUserId("user-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setPriorityLevel(PriorityLevel.HIGH);
		responseDTO.setCreatedAt(now);
	}

	@Test
	void shouldCreateVote() {

		Request request = new Request();

		when(securityService.getAuthenticatedUserId()).thenReturn("user-id");
		when(voteValidationService.validateRequest(createDTO.getRequestId())).thenReturn(request);

		doNothing().when(voteValidationService).validateOwnVote("user-id", createDTO.getRequestId());
		doNothing().when(voteValidationService).validateDuplicateVote("user-id", createDTO.getRequestId());

		when(voteMapper.toEntity(createDTO, "user-id")).thenReturn(vote);
		when(dateTimeProvider.now()).thenReturn(now);
		when(voteRepository.save(vote)).thenReturn(vote);
		when(voteMapper.toResponse(vote)).thenReturn(responseDTO);

		VoteResponseDTO result = voteCommandService.create(createDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, vote.getCreatedAt());

		verify(securityService).getAuthenticatedUserId();
		verify(voteValidationService).validateRequest(createDTO.getRequestId());
		verify(voteValidationService).validateOwnVote("user-id", createDTO.getRequestId());
		verify(voteValidationService).validateDuplicateVote("user-id", createDTO.getRequestId());
		verify(voteMapper).toEntity(createDTO, "user-id");
		verify(voteRepository).save(vote);
		verify(voteMapper).toResponse(vote);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\vote\VoteQueryServiceTest.java

```java
package com.iagomoreira.urbanflow.service.vote;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.mapper.VoteMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@ExtendWith(MockitoExtension.class)
class VoteQueryServiceTest {

	@Mock
	private VoteRepository voteRepository;

	@Mock
	private VoteValidationService voteValidationService;

	@Mock
	private VoteMapper voteMapper;

	@InjectMocks
	private VoteQueryService voteQueryService;

	private Vote vote;
	private VoteResponseDTO responseDTO;
	private RequestPriorityDTO priorityDTO;

	@BeforeEach
	void setUp() {
		vote = new Vote();
		vote.setId("vote-id");
		vote.setUserId("user-id");
		vote.setRequestId("request-id");
		vote.setPriorityLevel(PriorityLevel.HIGH);
		vote.setCreatedAt(LocalDateTime.now());

		responseDTO = new VoteResponseDTO();
		responseDTO.setId("vote-id");
		responseDTO.setUserId("user-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setPriorityLevel(PriorityLevel.HIGH);

		priorityDTO = new RequestPriorityDTO();
	}

	@Test
	void shouldFindAllVotes() {
		when(voteRepository.findAll()).thenReturn(List.of(vote));
		when(voteMapper.toResponse(vote)).thenReturn(responseDTO);

		List<VoteResponseDTO> result = voteQueryService.findAll();

		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(voteRepository).findAll();
		verify(voteMapper).toResponse(vote);
	}

	@Test
	void shouldFindVotesByRequest() {

		Request requestMock = mock(Request.class);

		when(voteValidationService.validateRequest("request-id")).thenReturn(requestMock);
		when(voteRepository.findByRequestId("request-id")).thenReturn(List.of(vote));
		when(voteMapper.toResponse(vote)).thenReturn(responseDTO);

		List<VoteResponseDTO> result = voteQueryService.findByRequest("request-id");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(voteValidationService).validateRequest("request-id");
		verify(voteRepository).findByRequestId("request-id");
		verify(voteMapper).toResponse(vote);
	}

	@Test
	void shouldReturnPriorityStatistics() {

		Request requestMock = mock(Request.class);
		when(voteValidationService.validateRequest("request-id")).thenReturn(requestMock);

		Vote low = new Vote();
		low.setPriorityLevel(PriorityLevel.LOW);

		Vote medium = new Vote();
		medium.setPriorityLevel(PriorityLevel.MEDIUM);

		Vote high = new Vote();
		high.setPriorityLevel(PriorityLevel.HIGH);

		when(voteRepository.findByRequestId("request-id")).thenReturn(List.of(low, medium, high));
		when(voteMapper.toPriorityResponse(1, 1, 1, 3, 33.333333333333336, 33.333333333333336, 33.333333333333336))
				.thenReturn(priorityDTO);

		RequestPriorityDTO result = voteQueryService.getRequestPriority("request-id");
		assertThat(result).isEqualTo(priorityDTO);

		verify(voteValidationService).validateRequest("request-id");
		verify(voteRepository).findByRequestId("request-id");
		verify(voteMapper).toPriorityResponse(1, 1, 1, 3, 33.333333333333336, 33.333333333333336, 33.333333333333336);
	}

	@Test
	void shouldReturnEmptyPriorityStatisticsWhenNoVotesExist() {

		Request requestMock = mock(Request.class);

		when(voteValidationService.validateRequest("request-id")).thenReturn(requestMock);
		when(voteRepository.findByRequestId("request-id")).thenReturn(List.of());
		when(voteMapper.toPriorityResponse(0, 0, 0, 0, 0.0, 0.0, 0.0)).thenReturn(priorityDTO);

		RequestPriorityDTO result = voteQueryService.getRequestPriority("request-id");
		assertThat(result).isEqualTo(priorityDTO);

		verify(voteValidationService).validateRequest("request-id");
		verify(voteRepository).findByRequestId("request-id");
		verify(voteMapper).toPriorityResponse(0, 0, 0, 0, 0.0, 0.0, 0.0);
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\service\vote\VoteValidationServiceTest.java

```java
package com.iagomoreira.urbanflow.service.vote;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@ExtendWith(MockitoExtension.class)
class VoteValidationServiceTest {

	@Mock
	private VoteRepository voteRepository;

	@Mock
	private UserRepository userRepository;

	@Mock
	private RequestRepository requestRepository;

	@InjectMocks
	private VoteValidationService voteValidationService;

	private Request request;

	@BeforeEach
	void setUp() {
		request = new Request();
		request.setId("request-id");
		request.setUserId("owner-id");
	}

	@Test
	void shouldValidateUser() {

		when(userRepository.existsById("user-id")).thenReturn(true);
		assertDoesNotThrow(() -> voteValidationService.validateUser("user-id"));
	}

	@Test
	void shouldThrowWhenUserDoesNotExist() {

		when(userRepository.existsById("user-id")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> voteValidationService.validateUser("user-id"));
	}

	@Test
	void shouldValidateRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));
		Request result = voteValidationService.validateRequest("request-id");
		assertEquals(request, result);
	}

	@Test
	void shouldThrowWhenRequestDoesNotExist() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> voteValidationService.validateRequest("request-id"));
	}

	@Test
	void shouldValidateDuplicateVote() {

		when(voteRepository.existsByUserIdAndRequestId("user-id", "request-id")).thenReturn(false);
		assertDoesNotThrow(() -> voteValidationService.validateDuplicateVote("user-id", "request-id"));
	}

	@Test
	void shouldThrowWhenVoteAlreadyExists() {

		when(voteRepository.existsByUserIdAndRequestId("user-id", "request-id")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> voteValidationService.validateDuplicateVote("user-id", "request-id"));
	}

	@Test
	void shouldValidateOwnVote() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));
		assertDoesNotThrow(() -> voteValidationService.validateOwnVote("user-id", "request-id"));
	}

	@Test
	void shouldThrowWhenVotingOwnRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));
		assertThrows(BusinessException.class, () -> voteValidationService.validateOwnVote("owner-id", "request-id"));
	}

	@Test
	void shouldThrowWhenOwnVoteRequestDoesNotExist() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class,
				() -> voteValidationService.validateOwnVote("user-id", "request-id"));
	}
}
```

# src\test\java\com\iagomoreira\urbanflow\UrbanflowApplicationTests.java

```java
package com.iagomoreira.urbanflow;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UrbanflowApplicationTests {

	@Test
	void contextLoads() {
	}

}

```

