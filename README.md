# clojure-ebnf-grammar

An Instaparse [EBNF grammar for the Clojure language](resources/clojure.ebnf).

## Usage

Add as a dependency:

![clojars version](https://clojars.org/clojure-ebnf-grammar/latest-version.svg)

Either require the parser:

```clojure
(ns my.namespace
  (:require [clojure.ebnf-grammar.parse :as p]))

(p/parse-clojure (slurp "my-file.clj"))
```

Or make use of [`resources/clojure.ebnf`](resources/clojure.ebnf) directly.

## Rationale

Grammars are a concise and descriptive way to formalize a language definition.

New tools may be easier to build if parsing Clojure was more accessible.

New languages might adopt Clojure grammar as a starting point for a new grammar.

Learners may benefit from a precise definition of Clojure grammar.

## Limitations

This grammar is not officially endorsed.

This grammar is not complete.

This grammar is built specifically for [Instaparse](https://github.com/Engelberg/instaparse).
While it might be possible to make a grammar that can be used in other context such as ANTLR,
this has not been attempted yet.

For most use cases, you should probably use [tools.analyzer](https://github.com/clojure/tools.analyzer) instead.

## Developing

Issues, pull requests, and suggestions are welcome.

## License

Copyright © 2020 Timothy Pratley

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
