# d3spike

Note currently you need to run lesscss manually:
- install node and npm
- sudo npm install -g less
- sudo npm install -g autoless

to automatically build less on file changes:
$ autoless static/less/custom static/css

Eventually we should install a java or clojure less compiler - several are out there, though they all look a little flakey

The project uses [Midje](https://github.com/marick/Midje/).

## How to run the tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.
