"""Hello unit test module."""

from pipeline.hello import hello


def test_hello():
    """Test the hello function."""
    assert hello() == "Hello pipeline"
