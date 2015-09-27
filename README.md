#scalajs-keyboard-polyfill


* dependency : `"com.viagraphs" %%% "scalajs-keyboard-polyfill" % "0.0.3"`
* Scala.js version : 0.6.5

Improves keyboard event handling experience in hostile browser environment

Primarily it allows you to abandon onpress events that have cross-browser incompatible behavior and
that are to be deprecated in favor of beforeinput events in W3C DOM4. Calling polyfill method on keydown/keyup PfEvent
gives you normalized keyCode across platforms and browsers and estimated charCode in case of a key representing
printable character. pfKeyCode and optional pfCharCode properties are added to Event object for possible latter use

NOTE: 

it might be eventually merged into [scala-js-dom](https://github.com/scala-js/scala-js-dom), see my [PR](https://github.com/scala-js/scala-js-dom/pull/61)
